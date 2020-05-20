package com.czc.pat.basiclevel._1To15;

import java.util.Calendar;
import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805308755394560
 * 1014 福尔摩斯的约会 (20分)
 */
public class _1014_HaveADate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(getWeekAndHour(scanner.nextLine(), scanner.nextLine()) +
                getMinute(scanner.nextLine(), scanner.nextLine()));

    }

    private static String getWeekAndHour(String str1, String str2){
        String week = "", hour = "";
        int length = Math.min(str1.length(), str1.length());
        for(int i = 0, count = 0; i < length; i++){
            if(str1.charAt(i) == str2.charAt(i)){
                char same = str1.charAt(i);
                if(count == 0){
                    if(isWeek(same)){
                        week = getWeek(same);
                        count ++;
                    }
                }else if(count == 1){
                    if(isHour(same)){
                        if(Character.isDigit(same)){
                            hour = "0" + same;
                        }else{
                            hour = String.valueOf(same - 'A' + 10);
                        }
                        break;
                    }
                }
            }
        }
        return week + " " + hour + ":";
    }

    private static boolean isWeek(char c){
        return c >= 'A' && c <= 'G';
    }

    private static boolean isHour(char c){
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'N');
    }

    private static String getMinute(String str1, String str2){
        String minute = "";
        int length = Math.min(str1.length(), str1.length());
        for(int i = 0; i < length; i++){
            if(Character.isAlphabetic(str1.charAt(i)) && str1.charAt(i) == str2.charAt(i)){
                minute = i >= 10 ? String.valueOf(i) : "0" + i;
                break;
            }
        }
        return minute;
    }

    private static String getWeek(char c){
        switch (c){
            case 'A':
                return "MON";
            case 'B':
                return "TUE";
            case 'C':
                return "WED";
            case 'D':
                return "THU";
            case 'E':
                return "FRI";
            case 'F':
                return "SAT";
            case 'G':
                return "SUN";
            default:
                return "";

        }
    }
}
