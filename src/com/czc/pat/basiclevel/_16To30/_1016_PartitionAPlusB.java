package com.czc.pat.basiclevel._16To30;

import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805306310115328
 * 1016 部分A+B (15分)
 */
public class _1016_PartitionAPlusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getP(scanner.nextLong(),scanner.nextInt()) +
                getP(scanner.nextLong(), scanner.nextInt()));
    }

    private static long getP(long a, int da){
        int count = 0;
        long p = 0;
        while(a != 0){
            if(a % 10 == da){
                p += (da * Math.pow(10,count));
                count++;
            }
            a /= 10;
        }
        return p;
    }
}
