package com.wadas.array;

import java.util.Arrays;

/**
 * @author: longfellow
 * @date: 2020/6/4
 *
 * @leetcode：238. 除自身以外数组的乘积
 * 最简单的思路：先求数组所有乘积，再用除法。缺点：如果数组中有一个0，最后乘积为0。
 * 则数组元素为0的位置，左右乘积不为0，需要重新遍历一次数组。或者第一次遍历时得到不为0的乘积。和所有乘积。
 */
public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                res[0] = 1;
            } else {
                res[i] = res[i-1] * nums[i-1];
            }
        }
        System.out.println(Arrays.toString(res));
        int tmp = 1;
        for (int i = length-2; i >= 0; i--) {
            tmp *= nums[i+1];
            res[i] *= tmp;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
