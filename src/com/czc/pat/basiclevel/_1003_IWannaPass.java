package com.czc.pat.basiclevel;

import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805323154440192\
 * 1003 我要通过！ (20分)
 * “答案正确”是自动判题系统给出的最令人欢喜的回复。本题属于 PAT 的“答案正确”大派送 —— 只要读入的字符串满足下列条件，系统就输出“答案正确”，否则输出“答案错误”。
 *
 * 得到“答案正确”的条件是：
 *
 * 字符串中必须仅有 P、 A、 T这三种字符，不可以包含其它字符；
 * 任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
 * 如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a、 b、 c 均或者是空字符串，或者是仅由字母 A 组成的字符串。
 * 现在就请你为 PAT 写一个自动裁判程序，判定哪些字符串是可以获得“答案正确”的。
 *
 * 输入格式：
 * 每个测试输入包含 1 个测试用例。第 1 行给出一个正整数 n (<10)，是需要检测的字符串个数。接下来每个字符串占一行，字符串长度不超过 100，且不包含空格。
 *
 * 输出格式：
 * 每个字符串的检测结果占一行，如果该字符串可以获得“答案正确”，则输出 YES，否则输出 NO。
 */
public class _1003_IWannaPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = Integer.parseInt(scanner.nextLine());
        String[] strToCheck = new String[quantity];
        String[] abc = new String[3];
        for(int i = 0; i < quantity; i++){
            strToCheck[i] = scanner.nextLine();
        }
        for(String check: strToCheck){
            match(check, abc);
        }
    }

    private static void match(String s, String[] abc){
        if (!s.matches("^[PAT]+")){
            System.out.println("NO");
            return;
        }
        if(s.contains("PAT")){
            String[] twoSide = s.split("PAT");
            for(String x: twoSide){
                if(!x.matches("^[A]*")){
                    System.out.println("NO");
                    return;
                }
            }
            abc[0] = twoSide.length > 0 ? twoSide[0] : "";
            abc[1] = "A";
            abc[2] = twoSide.length > 1 ? twoSide[1] : "";
            System.out.println("YES");
            return;
        }
        if((abc[0] + "P" + abc[1] + "AT" + abc[2] + abc[0]).equals(s)){
            System.out.println("YES");
            abc[1] = abc[1] + "A";
            abc[2] = abc[0] + abc[2];
        }else{
            System.out.println("NO");
        }
    }
}
