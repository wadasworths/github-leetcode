package com.wadas.str;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: longfellow
 * @date: 2020/6/3
 *
 * @leetcode：763. 划分字母区间
 * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，
 * 同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。
 *
 * 可以转换成区间合并问题：纪录每个字符的[start, end]看交叉情况
 */
public class PartitionLabels {
    public static List<Integer> partitionLabels(String S) {
        /**
         * 尽可能多的情况：特殊情况，每个字母划分，只出现一次；
         */
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i)
            last[S.charAt(i) - 'a'] = i;

        int j = 0, anchor = 0;
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < S.length(); ++i) {
            j = Math.max(j, last[S.charAt(i) - 'a']);
            if (i == j) {
                ans.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
