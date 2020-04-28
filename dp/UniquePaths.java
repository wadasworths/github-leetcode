package com.wadas.dp;

/**
 * @author: longfellow
 * @date: 2020/4/28
 *
 * @leetcode: 62. 不同路径
 * 一个机器人位于一个 m x n 网格的左上角, 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角
 * 动态规划方程，能到达二维矩阵 (m, n)：dp[m][n] = dp[m-1][n] + dp[m][n-1]
 * m = 0 || n == 0 时，dp[m][n] = 1
 * 时间复杂度O(m*n) 空间复杂度O(m*n)
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) return 1;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        UniquePaths solution = new UniquePaths();
        System.out.println(solution.uniquePaths(7, 3));
    }
}
