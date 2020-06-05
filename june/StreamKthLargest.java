package com.wadas.june;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author: longfellow
 * @date: 2020/6/5
 *
 * 超时；
 */
public class StreamKthLargest {
    private PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer t1, Integer t2) {
            return t2.compareTo(t1);
        }
    });
    private int k;

    public StreamKthLargest(int k, int[] nums) {
        this.k = k;
        for (int num: nums) {
            this.heap.add(num);
        }
    }

    public int add(int val) {
        this.heap.add(val);
        List<Integer> tmp = new ArrayList<>();
        int flag = this.k;
        while (flag > 1) {
            int m = heap.poll();
            //System.out.println(m);
            tmp.add(m);
            flag--;
        }
        int res = heap.peek();

        for (int n: tmp) {
            this.heap.add(n);
        }

        return res;
    }

    public void getHeap() {
        System.out.println(heap + " : " + k);
    }

    public static void main(String[] args) {
        int k = 3;
        int[] nums = {4, 5, 8, 2};
        StreamKthLargest solution = new StreamKthLargest(k, nums);
        solution.getHeap();
        System.out.println(solution.add(3));
        solution.getHeap();
        System.out.println(solution.add(5));
        solution.getHeap();
        System.out.println(solution.add(10));
        solution.getHeap();
        System.out.println(solution.add(9));
        solution.getHeap();
        System.out.println(solution.add(4));
        solution.getHeap();
    }
}
