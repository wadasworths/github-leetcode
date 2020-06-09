package com.wadas.june;

import java.util.*;

/**
 * @author: longfellow
 * @date: 2020/6/9
 */
public class RandomizedSetV2 {
    private Map<Integer, Integer> map;
    private List<Integer> list;
    private int size;
    private Random random = new Random();

    /** Initialize your data structure here. */
    public RandomizedSetV2() {
        this.map = new HashMap<>();
        this.list = new ArrayList<>();
        this.size = 0;
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;

        map.put(val, size);
        list.add(size, val);
        size++;
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        int lastElement = list.get(size - 1);
        int index = map.get(val);

        list.set(index, lastElement);
        map.put(lastElement, index);

        list.remove(size-1);
        map.remove(val);
        size--;
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int tmp = random.nextInt(size);

        return list.get(tmp);
    }
}
