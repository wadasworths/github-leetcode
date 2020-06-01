package com.wadas.backtrack;

/**
 * @author: longfellow
 * @date: 2020/4/28
 *
 * @leetcode: 60. 第k个排列
 * 给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 */
public class Permutation {
    public String getPermutation(int n, int k) {
        int m = 1;
        for (int i = 1; i <= n; i++) {
            String res = "";
            res += i;
            for (int j = 1; j <= n; j++) {
                if (i ==j ) continue;
                res += j;
            }
            //if (m == k) return res;
            m++;
            System.out.println(res);
        }

        return "";
    }

    public static void main(String[] args) {
        Permutation solution = new Permutation();
        System.out.println(solution.getPermutation(3, 3));
    }
}
