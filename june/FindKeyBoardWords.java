package com.wadas.june;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: longfellow
 * @date: 2020/6/4
 *
 * @leetcode: 500. 键盘行
 */
public class FindKeyBoardWords {
    public String[] findWords(String[] words) {
        Map<Character, Integer> letterTable = new HashMap<>(26);
        letterTable.put('q', 0);
        letterTable.put('w', 0);
        letterTable.put('e', 0);
        letterTable.put('r', 0);
        letterTable.put('t', 0);
        letterTable.put('y', 0);
        letterTable.put('u', 0);
        letterTable.put('i', 0);
        letterTable.put('o', 0);
        letterTable.put('p', 0);
        letterTable.put('a', 1);
        letterTable.put('s', 1);
        letterTable.put('d', 1);
        letterTable.put('f', 1);
        letterTable.put('g', 1);
        letterTable.put('h', 1);
        letterTable.put('j', 1);
        letterTable.put('k', 1);
        letterTable.put('l', 1);
        letterTable.put('z', 2);
        letterTable.put('x', 2);
        letterTable.put('c', 2);
        letterTable.put('v', 2);
        letterTable.put('b', 2);
        letterTable.put('n', 2);
        letterTable.put('m', 2);

        List<Integer> list = new ArrayList<>();
//        for (String word: words) {
//            word = word.toLowerCase();
//
//            int i = 1;
//            int flag = letterTable.get(word.charAt(0));
//            while (i < word.length()) {
//                if (letterTable.get(word.charAt(i)) == flag){
//                    i++;
//                } else {
//                    break;
//                }
//            }
//            if (i == word.length()) {
//                list.add(word);
//            }
//        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();

            int j = 1;
            int flag = letterTable.get(word.charAt(0));
            while (j < word.length()) {
                if (letterTable.get(word.charAt(j)) == flag){
                    j++;
                } else {
                    break;
                }
            }
            if (j == word.length()) {
                list.add(i);
            }
        }

        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = words[list.get(i)];
        }
        return res;
    }
}
