package com.wadas.array;

/**
 * @author: longfellow
 * @date: 2020/4/28
 *
 * @leetcode: 80. 删除排序数组中的重复项 II
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;

        int index = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[index-2])
                nums[index++] = nums[i];
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
    }
}
