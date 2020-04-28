package com.wadas.dp;

/**
 * @author: longfellow
 * @date: 2020/4/28
 *
 * @leetcode: 63. 不同路径 II
 * 一个机器人位于一个 m x n 网格的左上角, 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * 动态规划方程，能到达二维矩阵 (m, n)：dp[m][n] = dp[m-1][n] + dp[m][n-1]
 * m = 0 || n == 0 时，dp[m][n] = 1
 * 时间复杂度O(m*n) 空间复杂度O(m*n)
 */
public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1) return 0;

        int[][] dp = new int[m][n];
        // 初始化 (0, 0) = 1
        dp[0][0] = 1;
        for (int i = 1; i < m; i++) {
            dp[i][0] = (obstacleGrid[i][0] == 0 && dp[i-1][0] == 1) ? 1 : 0;
        }

        for (int i = 0; i < n; i++) {
            dp[0][i] = (obstacleGrid[0][i] == 0 && dp[0][i-1] == 1) ? 1 : 0;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return dp[m-1][n-1];
    }
}
