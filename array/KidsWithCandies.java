package com.wadas.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: longfellow
 * @date: 2020/6/1
 *
 * @leetcode: 1431. 拥有最多糖果的孩子
 */
public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy: candies) {
            max = candy > max ? candy : max;
        }

        List<Boolean> res = new ArrayList<>();
        for (int candy: candies) {
            res.add((candy + extraCandies) > max);
        }
        return res;
    }
}
