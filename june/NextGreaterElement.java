package com.wadas.june;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: longfellow
 * @date: 2020/6/8
 *
 * @leetcode: 496.下一个更大元素。
 */
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length - 1; i++) {
            int m = nums2[i];
            for (int j = i+1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]) {
                    map.put(nums2[i], nums2[j]);
                    break;
                }
            }
        }

        int n = 0;
        for (int num1: nums1) {
            if (map.get(num1) != null) {
                res[n] = map.get(num1);
            } else {
                res[n] = -1;
            }
            n++;
        }
        return res;
    }
}
