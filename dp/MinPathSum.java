package com.wadas.dp;

/**
 * @author: longfellow
 * @date: 2020/4/28
 *
 * @leetcode: 64. 最小路径和
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 动态规划方程，能到达二维矩阵 (m, n)坐标最小路径： dp[m][n] = Min(dp[m-1][n], dp[m][n-1]) + grid[m][n]
 * 初始化dp[0][0] = grid[0][0]
 * m = 0 时，dp[0][n] = dp[0][n-1] + grid[0][n]
 * n = 0 时，dp[m][0] = dp[m-1][0] + grid[m][0]
 * 时间复杂度O(m*n) 空间复杂度O(m*n)
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;

        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                }

                if (i == 0 && j != 0) {
                    dp[i][j] = dp[i][j-1] + grid[i][j];
                }

                if (i != 0 && j == 0) {
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                }

                if (i != 0 && j != 0) {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
                }
            }
        }

        return dp[m-1][n-1];
    }
}
