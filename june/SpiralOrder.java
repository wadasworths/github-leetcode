package com.wadas.june;

/**
 * @author: longfellow
 * @date: 2020/6/5
 *
 * @leetcode: 面试题29. 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 */
public class SpiralOrder {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0 || matrix[0].length==0) {
            return new int[]{};
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[] res = new int[row*col];

        int left = 0, right = col - 1, top = 0, bottom = row - 1;
        int m = 0;
        while (left<=right && top<=bottom) {
            // left to right;
            for (int i = left; i <= right; i++) {
                res[m] = matrix[left][i];
                m++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res[m] = matrix[i][right];
                m++;
            }
            right--;
            for (int i = right; i >= left && top <= bottom; i--) {
                res[m] = matrix[bottom][i];
                m++;
            }
            bottom--;
            for (int i = bottom; i >= top && left <= right; i--) {
                res[m] = matrix[i][left];
                m++;
            }
            left++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        System.out.println(spiralOrder(matrix));
    }
}
