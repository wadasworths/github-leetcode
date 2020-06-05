package com.wadas.june;

/**
 * @author: longfellow
 * @date: 2020/6/5
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        /**
         * 可能会求和溢出
         */
        int n = nums.length+1;
        int sum = (n * (n+1)) /2;
        for (int num: nums) {
            sum -= num;
        }
        return sum;
    }
}
