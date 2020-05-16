package com.czc.pat.basiclevel;

import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805324509200384
 * 1002 写出这个数 (20分)
 * 读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
 *
 * 输入格式：
 * 每个测试输入包含 1 个测试用例，即给出自然数 n 的值。这里保证 n 小于 10^100
 *
 * 输出格式：
 * 在一行内输出 n 的各位数字之和的每一位，拼音数字间有 1 空格，但一行中最后一个拼音数字后没有空格。
 */
public class _1002_WriteNumber {
    private static String[] bopomofo = new String[]{"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        int sum = getAllDigitsSum(inputStr);
        printBopomofo(sum);
    }

    private static int getAllDigitsSum(String str){
        int result = 0;
        for(char c: str.toCharArray()){
            result += Character.getNumericValue(c);
        }
        return  result;
    }

    private static void printBopomofo(int num){
        char[] numToChars = Integer.toString(num).toCharArray();
        System.out.print(bopomofo[(int)numToChars[0] - (int)'0']);
        for(int i = 1; i < numToChars.length; i++){
            System.out.print(" ");
            System.out.print(bopomofo[(int)numToChars[i] - (int)'0']);
        }
    }
}
