package com.wadas.str;

import java.util.*;

/**
 * @author: longfellow
 * @date: 2020/6/3
 *
 * @leetcode 1177. 构建回文串检测
 */
public class CanMakePaliQueries {
    public static List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> res = new ArrayList<>();
        for (int[] query: queries) {
            String sb = "";
            sb = s.substring(query[0], query[1]+1);

            if (sb.length() == 1) {
                res.add(true);
            } else {
                int count = 0;
                int left = 0, right = sb.length()-1;
                while (left < right) {
                    if (sb.charAt(left) != sb.charAt(right)) {
                        ++count;
                    }
                    left++;
                    right--;
                }

                if (count <= query[2]){
                    res.add(true);
                } else {
                    Map<Character, Integer> map = new HashMap<>();
                    for (int i = 0; i < sb.length(); i++) {
                        map.put(sb.charAt(i), map.getOrDefault(sb.charAt(i), 0)+1);
                    }

                    System.out.println(map.values() + " : " +query[2]);
                    int odd = 0;
                    for (Integer tmp: map.values()) {
                        if (tmp % 2 != 0){
                            ++odd;
                        }
                    }
                    if (query[2] >= (odd / 2)) {
                        res.add(true);
                    } else {
                        res.add(false);
                    }
                }
            }
        }

        return res;
    }
}
