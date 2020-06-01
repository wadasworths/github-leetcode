package com.wadas.array;

/**
 * @author: longfellow
 * @date: 2020/5/23
 *
 * @leetcode: 81. 搜索旋转排序数组 II
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。( 例如，数组 [0,0,1,2,2,5,6] 可能变为 [2,5,6,0,0,1,2] )。
 * 编写一个函数来判断给定的目标值是否存在于数组中。若存在返回 true，否则返回 false。
 */
public class SearchRotateArray {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if (nums[mid] == target) {
                return true;
            }

            if (nums[left] < nums[mid]) {
                if (nums[mid] > target && target>nums[left]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[left] > nums[mid]) {
                if(nums[mid] < target && target < nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            } else {
                if(nums[mid]==nums[left])
                    left++;
                else
                    right--;
            }
        }

        return false;
    }
}
