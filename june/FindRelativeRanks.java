package com.wadas.june;

import java.util.*;

/**
 * @author: longfellow
 * @date: 2020/6/4
 *
 * @leetcode：506. 相对名次
 * 给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。
 * 前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal", "Silver Medal", "Bronze Medal"）。
 * 输入: [5, 4, 3, 2, 1]
 * 输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * 余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。
 */
public class FindRelativeRanks {
    public static String[] findRelativeRanks(int[] nums) {
        int length = nums.length;
        String[] res = new String[length];

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            new Comparator<Integer>() {
                @Override
                public int compare(Integer t1, Integer t2) {
                return t2.compareTo(t1);
            }
        });

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(nums[i], i);
            heap.add(nums[i]);
        }

        int order = 1;
        while (!heap.isEmpty()) {
            int num = heap.poll();
            int tmp = map.get(num);
            switch (order) {
                case 1: res[tmp] = "Gold Medal";break;
                case 2: res[tmp] = "Silver Medal";break;
                case 3: res[tmp] = "Bronze Medal";break;
                default:res[tmp] = ""+order;
            }
            ++order;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 5, 7, 2};
        System.out.println(Arrays.toString(findRelativeRanks(nums)));
    }
}
