package com.czc.pat.mooczice;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *https://pintia.cn/problem-sets/17/problems/263
 * 自测-4 Have Fun with Numbers (20分)
 *
 * Notice that the number 123456789 is a 9-digit number consisting exactly the numbers from 1 to 9, with no duplication. Double it we will obtain 246913578, which happens to be another 9-digit number consisting exactly the numbers from 1 to 9, only in a different permutation. Check to see the result if we double it again!
 * Now you are suppose to check if there are more numbers with this property. That is, double a given number with k digits, you are to tell if the resulting number consists of only a permutation of the digits in the original number.
 *
 * Input Specification:
 * Each input contains one test case. Each case contains one positive integer with no more than 20 digits.
 *
 * Output Specification:
 * For each test case, first print in a line "Yes" if doubling the input number gives a number that consists of only a permutation of the digits in the original number, or "No" if not. Then in the next line, print the doubled number.
 *
 * Sample Input:
 * 1234567899
 * Sample Output:
 * Yes
 * 2469135798
 */
public class HaveFunWithNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger inputNum = scanner.nextBigInteger();
        BigInteger doubleNum = inputNum.multiply(BigInteger.valueOf(2));
        if(Arrays.equals(countDigits(inputNum),countDigits(doubleNum))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(doubleNum);
    }

    private static int[] countDigits(BigInteger number){
        int[] result = new int[10];
        String str = String.valueOf(number);
        for(char c: str.toCharArray()){
            result[(int)c - (int)'0'] ++;
        }
        return result;
    }
}
