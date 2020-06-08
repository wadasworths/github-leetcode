package com.wadas.june;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: longfellow
 * @date: 2020/6/8
 */
public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix.length==0 || matrix[0].length==0) return;
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int m: row) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[m][i] = 0;
            }
        }

        for (int n: col) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][n] = 0;
            }
        }

        return;
    }
}
