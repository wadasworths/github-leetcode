package com.wadas.sort;

import java.util.Arrays;

/**
 * @author: longfellow
 * @date: 2020/4/20
 */
public class BubbleSort {
    /**
     * 冒泡排序是一种稳定的排序算法，时间复杂度是O(n*n), 空间复杂度是O(1);
     * 基本思路是，前后元素相比较，把较大值后移，每次都有一个最大值元素归位。
     */
    public int[] bubbleSort(int[] nums) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length-i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }

        return nums;
    }
}
