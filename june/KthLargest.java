package com.wadas.june;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author: longfellow
 * @date: 2020/6/5
 */
public class KthLargest {
    private final PriorityQueue<Integer> q ;
    private final int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<Integer>(k);
        for(int i: nums) {
            add(i);
        }
    }

    public int add(int val) {
        if(q.size() < k) {
            q.offer(val);

        }
        else if(q.peek() < val) {
            q.poll();
            q.offer(val);
        }
        return q.peek();
    }
}
