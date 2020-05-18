package com.czc.pat.basiclevel._1To15;

import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805311146147840
 * 1012 数字分类 (20分)
 *
 */
public class _1012_NumberClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] aArray = new int[5], count = new int[5];
        while(num > 0){
            int input = scanner.nextInt();
            switch (input % 5){
                case 0:
                    if(input % 2 == 0){
                        aArray[0] += input;
                        count[0] ++;
                    }
                    break;
                case 1:
                    if(count[1] % 2 == 0){
                        aArray[1] += input;
                    }else{
                        aArray[1] -= input;
                    }
                    count[1] ++;
                    break;
                case 2:
                    count[2] ++;
                    break;
                case 3:
                    aArray[3] += input;
                    count[3] ++;
                    break;
                case 4:
                    aArray[4] = Math.max(input, aArray[4]);
                    count[4] ++;
                    break;
                default:
                    break;
            }
            num --;
        }
        aArray[2] = count[2];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 5; i++){
            if(i == 3){
                sb.append(count[i] > 0? String.format("%.1f",(float)aArray[i]/count[i]): "N").append(" ");
            }else{
                sb.append(count[i] > 0 ? aArray[i] : "N").append(" ");
            }

        }
        System.out.println(sb.deleteCharAt(sb.lastIndexOf(" ")).toString());
    }


}
