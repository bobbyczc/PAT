package com.czc.pat.basiclevel._1To15;

import java.util.Scanner;

public class _1008_RightShiftArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenth = scanner.nextInt();
        int offset = scanner.nextInt();
        int[] initArray = new int[lenth];
        for(int i = 0; i <lenth; i++){
            initArray[i] = scanner.nextInt();
        }
        rightShiftArray(initArray, offset);
        System.out.print(initArray[0]);
        for (int i = 1; i < lenth; i++){
            System.out.print(" " + initArray[i]);
        }
    }

    private static void rightShiftOne(int[] array){
        int temp = array[0], swap = 0;
        for(int i = 0; i < array.length -1; i++){
            swap = array[i+1];
            array[i+1] = temp;
            temp = swap;
        }
        array[0] = temp;
    }

    private static void rightShiftArray(int[] array, int offset){
        for(int i = 0; i < offset; i++){
            rightShiftOne(array);
        }
    }
}
