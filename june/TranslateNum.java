package com.wadas.june;

/**
 * @author: longfellow
 * @date: 2020/6/9
 *
 * @leetcode: 面试题46. 把数字翻译成字符串
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
 * 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 *
 * 爬楼梯或青蛙跳台阶问题，一次可以划分一个字母。也可以划分两个字母，如果两个字母连起来不以0开头 或者小于等于25 则加1.
 */
public class TranslateNum {
    public static int translateNum(int num) {
        if (num < 10) return 1;

        String str = String.valueOf(num);
//        int[] dp = {0, 1, 1};
//        for (int i = 1; i < str.length(); i++) {
//            dp[0] = dp[1];
//            dp[1] = dp[2];
//
//            String pre = str.substring(i - 1, i + 1);
//            if (pre.compareTo("25") <= 0 && pre.compareTo("10") >= 0) {
//                dp[2] += dp[0];
//            }
//        }
//
//        return dp[2];
        int a = 1, b = 1;
        for (int i = 1; i < str.length(); i++) {
            int tmp = a + b;
            a = b;
            String pre = str.substring(i - 1, i + 1);
            if (pre.compareTo("25") <= 0 && pre.compareTo("10") >= 0) {
                b = tmp;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        System.out.println(translateNum(122258));
    }
}
