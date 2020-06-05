package com.wadas.june;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: longfellow
 * @date: 2020/6/5
 *
 * @leetcode: 263. 丑数
 * 编写一个程序判断给定的数是否为丑数。
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 */
public class IsUgly {
    public static boolean isUgly(int num) {
        while (num != 0 && (num % 2 == 0 || num % 3 == 0 || num % 5 == 0)) {
            if (num % 2 == 0)
                num /= 2;
            if (num % 3 == 0)
                num /= 3;
            if (num % 5 == 0)
                num /= 5;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            if (isUgly(i))
                res.add(i);
        }
        System.out.println(res.size());
    }
}
