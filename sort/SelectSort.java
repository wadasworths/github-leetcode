package com.wadas.sort;

/**
 * @author: longfellow
 * @date: 2020/4/20
 */

/**
 * 选择排序：标记一个当前最小的元素，从后面的数字中选出最小元素
 * 最后交换一次最小元素。减少交换次数。
 */
public class SelectSort {
    public static int[] selectSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            // 当前最小元素
            int min = i;
            // 前面的位置是已排序的元素
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[min]) min = j;
            }
            int temp = array[i];
            array[i]  = array[min];
            array[min] = temp;
        }

        return array;
    }
}
