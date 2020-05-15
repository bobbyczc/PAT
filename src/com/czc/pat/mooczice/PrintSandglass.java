package com.czc.pat.mooczice;

import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/17/problems/260
 * 自测1
 * 本题要求你写个程序把给定的符号打印成沙漏的形状。例如给定17个“*”，要求按下列格式打印
 *
 * *****
 *  ***
 *   *
 *  ***
 * *****
 * 所谓“沙漏形状”，是指每行输出奇数个符号；各行符号中心对齐；相邻两行符号数差2；
 * 符号数先从大到小顺序递减到1，再从小到大顺序递增；首尾符号数相等。
 * 给定任意N个符号，不一定能正好组成一个沙漏。要求打印出的沙漏能用掉尽可能多的符号。
 */
public class PrintSandglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String symbol = scanner.next();
        int level = (int)Math.sqrt((num + 1) / 2) ;
        int maxlength = 2 * level - 1;
        int left = num - (int)Math.pow(level,2) * 2 + 1;
        printSandglass(maxlength,symbol);
        System.out.print(left);
    }

    public static void printSandglass(int maxlength, String symbol){
        int spaceCount = 0;
        int symbolCount = maxlength;
        while(symbolCount >=1){
            printSymbol(spaceCount," ");
            printSymbol(symbolCount,symbol);
            System.out.println();
            spaceCount++;
            symbolCount -= 2;
        }
        spaceCount-= 2;
        symbolCount += 4;
        while(symbolCount <= maxlength){
            printSymbol(spaceCount," ");
            printSymbol(symbolCount,symbol);
            System.out.println();
            spaceCount--;
            symbolCount +=2;
        }
    }

    private static void printSymbol(int num, String symbol){
        for(int i = 0; i < num; i++){
            System.out.print(symbol);
        }
    }

}
