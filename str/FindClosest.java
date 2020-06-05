package com.wadas.str;

/**
 * @author: longfellow
 * @date: 2020/6/3
 */
public class FindClosest {
    public int findClosest(String[] words, String word1, String word2) {
        int res = 0;
        int word1Index = 0;
        int word2Index = 0;
        for (int i = 0; i < words.length; i++) {
            if (word1 == words[i]) {
                word1Index = i;
                res = Math.min(res, Math.abs(word1Index- word2Index));
            }

            if (word2 == words[i]) {
                word2Index = i;
                res = Math.min(res, Math.abs(word1Index- word2Index));
            }

            res = Math.min(res, Math.abs(word1Index- word2Index));
        }

        return res;
    }
}
