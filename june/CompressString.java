package com.wadas.june;

/**
 * @author: longfellow
 * @date: 2020/6/8
 */
public class CompressString {
    public static String compressString(String S) {
        StringBuffer sb = new StringBuffer();
        char[] chars = S.toCharArray();
        int length = S.length();

        for (int i = 0, j = 1; j <= length;) {
            if ((j < length && chars[i] != chars[j] ) || j == length) {
                sb.append(chars[i]);
                sb.append(j-i);
                i = j;
            }
            j++;
        }

        return sb.length() < length ? sb.toString() : S;
    }

    public static void main(String[] args) {
        System.out.println(compressString("aabcccccaa"));
    }
}
