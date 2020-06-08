package com.wadas.june;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: longfellow
 * @date: 2020/6/8
 *
 * 面试题 01.04. 回文排列
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 *
 * HashMap统计频率
 * 遍历一遍集合，插入删除，最后查看集合长度。
 */
public class CanPermutePalindrome {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character tmp = s.charAt(i);
            map.put(tmp, map.getOrDefault(tmp, 0)+1);
        }

        int flag = 0;
        for (Map.Entry entry: map.entrySet()) {
            if ((int)entry.getValue()%2 != 0) {
                flag++;
            }
            if (flag > 1) {
                return false;
            }
        }

        return true;
    }
}
