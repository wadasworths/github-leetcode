package com.wadas.june;

/**
 * @author: longfellow
 * @date: 2020/6/4
 *
 * @leetcode: 504. 七进制数
 * 给定一个整数，将其转化为7进制，并以字符串形式输出。
 */
public class ConvertToBaseSeven {
    public static String convertToBase7(int num) {
        if (num==0) return "0";
        StringBuilder sb = new StringBuilder();
        int m = 0;
        int n = Math.abs(num);
        while (n > 0) {
            m = n % 7;
            n /= 7;
            sb.append(m);
        }

        return num > 0 ? sb.reverse().toString() : "-"+sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(0));
    }
}
