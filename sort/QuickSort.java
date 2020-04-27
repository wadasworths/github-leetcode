package com.wadas.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: longfellow
 * @date: 2020/4/20
 */
public class QuickSort {
    public void quickSort(int[] nums, int low, int high) {
        if (nums.length <= 0 || low  >= high) return;

        int left = low;
        int right = high;
        int tmp = nums[left];
        while (left < right) {
            while (nums[right] >= tmp && left<right) {
                right--;
            }
            nums[left] = nums[right];

            while (nums[left] <= tmp && left<right) {
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = tmp;

        quickSort(nums, low, left-1);
        quickSort(nums, left+1, high);
    }
}
