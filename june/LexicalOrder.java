package com.wadas.june;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: longfellow
 * @date: 2020/6/8
 *
 * @leetcode: 386. 字典序排数
 * 给定一个整数 n, 返回从 1 到 n 的字典顺序。
 * 例如，
 * 给定 n =1 3，返回 [1,10,11,12,13,2,3,4,5,6,7,8,9] 。
 */
public class LexicalOrder {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; i++)
            dfs(n, i, res);
        return res;
    }

    private void dfs(int n, int target, List<Integer> list) {
        if (target > n) return;
        list.add(target);
        target *= 10;
        for (int i = 0; i < 10; i++)
            dfs(n, target + i, list);
    }
}