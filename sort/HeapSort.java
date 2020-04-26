package com.wadas.sort;

import java.util.Arrays;

/**
 * @author: longfellow
 * @date: 2020/4/20
 */
public class HeapSort {
    /**
     * 小顶堆，和大顶堆的应用场景。
     */
    public int[] heapSort(int[] nums) {
        for(int i = nums.length; i > 0; i--){
            max_heapify(nums, i);

            int temp = nums[0];      //堆顶元素(第一个元素)与Kn交换
            nums[0] = nums[i-1];
            nums[i-1] = temp;
        }
        return nums;
    }

    private static void max_heapify(int[] arr, int limit) {
        if(arr.length <= 0 || arr.length < limit) return;
        //int parentIdx = limit / 2;
        int parentIdx = (limit >> 1) - 1;

        for(; parentIdx >= 0; parentIdx--){
            if(parentIdx * 2 >= limit){
                continue;
            }
            int left = (parentIdx * 2) + 1;       //左子节点位置
            int right = (left + 1) >= limit ? left : (left + 1);    //右子节点位置，如果没有右节点，默认为左节点位置

            int maxChildId = arr[left] >= arr[right] ? left : right;
            if(arr[maxChildId] > arr[parentIdx]){   //交换父节点与左右子节点中的最大值
                int temp = arr[parentIdx];
                arr[parentIdx] = arr[maxChildId];
                arr[maxChildId] = temp;
            }
        }
    }
}
