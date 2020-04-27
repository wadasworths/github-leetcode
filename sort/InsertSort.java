package com.wadas.sort;

/**
 * @author: longfellow
 * @date: 2020/4/20
 */

/**
 * 插入排序：将后面的元素一次插入到前面有序的排序中
 * 前面的位置是已排序的元素
 */
public class InsertSort {
    public static int[] insertSort(int[] array) {
        // 第一个元素索引 0 假设已经排好序
        for (int i = 1; i < array.length; i++) {
            // 已排好序的元素截至位置
            int temp = array[i];
            for (int j = i; j >=0 ; j--) {
                if( j > 0 && array[j-1] > temp ) {
                    array[j] = array[j-1];    	// 如果该元素（已排序）大于取出的元素temp，将该元素移到下一位置
                } else {
                    array[j] = temp;			// 将新元素插入到该位置后
                    break;
                }
            }
        }

        return array;
    }
}
