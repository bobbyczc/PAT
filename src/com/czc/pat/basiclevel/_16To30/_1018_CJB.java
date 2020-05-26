package com.czc.pat.basiclevel._16To30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805304020025344
 * 1018 锤子剪刀布 (20分)
 */
public class _1018_CJB {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        //记录甲乙赢的次数
        int[] record = new int[6];
        int[] jiaRecord = new int[3];
        String caseStr[];
        int result;
        while(count > 0){
            caseStr = reader.readLine().split(" ");
            result = getResult(caseStr[0],caseStr[1],record);
            if(result == 1){
                jiaRecord[0]++;
            }else if(result == 0){
                jiaRecord[1] ++;
            }else{
                jiaRecord[2] ++;
            }
            count--;
        }
        System.out.println(jiaRecord[0] + " " + jiaRecord[1] + " " + jiaRecord[2]);
        System.out.println(jiaRecord[2] + " " + jiaRecord[1] + " " + jiaRecord[0]);
        System.out.println(getStr(record,0,2) + " " + getStr(record,3,5));
    }

    private static String getStr(int[] record, int begin, int end){
        int index = 0, temp = 0;
        for(int i = begin; i <= end; i++){
            if(record[i] > temp){
                index = i;
                temp = record[i];
            }
        }
        switch (index % 3){
            case 0:
                return "B";
            case 1:
                return "C";
            default:
                return "J";
        }
    }
    private static int getResult(String aStr, String bStr, int[] record){
        if(aStr.equals(bStr))
            return 0;
        if("C".equals(aStr) ){
            if("B".equals(bStr)){
                record[3] ++;
                return -1;
            }else{
                record[1] ++;
                return 1;
            }
        }else if("B".equals(aStr)){
            if("J".equals(bStr)){
                record[5] ++;
                return -1;
            }else{
                record[0] ++;
                return 1;
            }
        }else{
            if("C".equals(bStr)){
                record[4] ++;
                return -1;
            }else{
                record[2] ++;
                return 1;
            }
        }
    }
}
