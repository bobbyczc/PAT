package com.czc.pat.basiclevel._1To15;

import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805314941992960
 * 1009 说反话 (20分)
 * 给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
 * 输入格式：
 * 测试输入包含一个测试用例，在一行内给出总长度不超过 80 的字符串。字符串由若干单词和若干空格组成，其中单词是由英文字母（大小写有区分）组成的字符串，单词之间用 1 个空格分开，输入保证句子末尾没有多余的空格。
 * 输出格式：
 * 每个测试用例的输出占一行，输出倒序后的句子。
 * 输入样例：
 * Hello World Here I Come
 * 输出样例：
 * Come I Here World Hello
 */
public class _1009_ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        for(int i = 0; i < words.length - 1; i++){
            System.out.print(words[words.length - 1 - i] + " ");
        }
        System.out.print(words[0]);
    }
}
