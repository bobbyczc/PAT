package com.czc.pat.basiclevel._1To15;

import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805308755394560
 * 1014 福尔摩斯的约会 (20分)
 */
public class _1014_HaveADate {
    public static void main(String[] args) {
        System.out.println((int)'D');
        Scanner scanner = new Scanner(System.in);
        String[] strArr = new String[4];
        for(int i = 0; i < 4; i++){
            strArr[i] = scanner.nextLine();
        }
    }

    private static String getWeekAndHour(String str1, String str2){
        int length = Math.min(str1.length(), str1.length());
        for(int i = 0, count = 1; i < length; i++, count++){
            if(count > 2) break;
            if(str1.charAt(i) == str2.charAt(i)){
                if (count == 1){

                }
            }
        }
        return "";
    }
}
