package com.czc.pat.basiclevel._16To30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805302786899968
 * 1019 数字黑洞 (20分)
 */
public class _1019_NumberDarkHole {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        char[] inputChar = input.toCharArray();
        if (isSame(inputChar)) {
            System.out.println(input + " - " + input + " = 0000");
        }else{
            Arrays.sort(inputChar);
            String b = String.valueOf(inputChar);
            reverse(inputChar);
            String a = String.valueOf(inputChar);
            int result;
            StringBuilder resultStr;
            while( (result = Integer.parseInt(a) - Integer.parseInt(b)) != 6174){
                resultStr = new StringBuilder("" + result);
                for(int i = 0, length = resultStr.length(); i < 4 - length; i++){
                    resultStr.insert(0, "0");
                }
                System.out.println(a + " - " + b + " = " + resultStr);
                inputChar = resultStr.toString().toCharArray();
                Arrays.sort(inputChar);
                b = String.valueOf(inputChar);
                reverse(inputChar);
                a = String.valueOf(inputChar);
            }
            System.out.println(a + " - " + b + " = 6174");
        }
    }

    private static void reverse(char[] chars){
        char temp = ' ';
        for(int i = 0, length = chars.length; i < length / 2; i++){
            temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }
    }

    private static boolean isSame(char[] chars){
        boolean flag = true;
        char temp = chars[0];
        for(char c:chars){
            if(c != temp){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
