package com.czc.pat.basiclevel._1To15;

import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805318855278592
 * 1006 换个格式输出整数 (15分)
 * 让我们用字母 B 来表示“百”、字母 S 表示“十”，用 12...n 来表示不为零的个位数字 n（<10），换个格式来输出任一个不超过 3 位的正整数。例如 234 应该被输出为 BBSSS1234，因为它有 2 个“百”、3 个“十”、以及个位的 4。
 *
 * 输入格式：
 * 每个测试输入包含 1 个测试用例，给出正整数 n（<1000）。
 *
 * 输出格式：
 * 每个测试用例的输出占一行，用规定的格式输出 n。
 *
 * 输入样例 1：
 */
public class _1006_ChangeIntFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        System.out.println(getIntWithDiffFormat(inputStr));
    }


    private static String getIntWithDiffFormat(String str){
        StringBuilder result = new StringBuilder();
        int length = str.length();
        if(length >= 1){
            for(int i = 1; i <= Character.getNumericValue(str.charAt(length - 1)); i++){
                result.append(i);
            }
        }
        if(length >= 2){
            for(int i = 1; i <= Character.getNumericValue(str.charAt(length - 2)); i++){
                result.insert(0, 'S');
            }
        }
        if(length >= 3){
            for(int i = 1; i <= Character.getNumericValue(str.charAt(length - 3)); i++){
                result.insert(0, 'B');
            }
        }
//        int divisor = 10;
//        while(num / divisor != 0){
//
//        }
        return result.toString();
    }



}
