package com.wadas.june;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: longfellow
 * @date: 2020/6/4
 *
 * @leetcode: 501. 二叉搜索树中的众数
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 *
 * 假定 BST 有如下定义：
 * 结点左子树中所含结点的值小于等于当前结点的值
 * 结点右子树中所含结点的值大于等于当前结点的值
 * 左子树和右子树都是二叉搜索树
 */
public class FindBSTMode {
//    public int[] findMode(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        treeMidOrder(root, list);
//
//
//        return null;
//    }
//
//    public void treeMidOrder(TreeNode root, List<Integer> list) {
//        if (root.left != null)
//            treeMidOrder(root.left, list);
//
//        list.add((int) root.val);
//
//        if (root.right != null)
//            treeMidOrder(root.right, list);
//    }
    public int[] findMode(TreeNode root) {
        if (root==null) return new int[]{};

        Map<Integer, Integer> map = new HashMap<>();
        treeMidOrder(root, map);

        int max = 0;
        for (int val: map.values()) {
            max = Math.max(max, val);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry entry: map.entrySet()) {
            if ((int)entry.getValue() == max) {
                list.add((int) entry.getKey());
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public void treeMidOrder(TreeNode root, Map map) {
        if (root.left != null) treeMidOrder(root.left, map);
        int val = (int) root.val;
        map.put(val, (int) map.getOrDefault(val, 0)+1);
        if (root.right != null) treeMidOrder(root.right, map);
    }
}
