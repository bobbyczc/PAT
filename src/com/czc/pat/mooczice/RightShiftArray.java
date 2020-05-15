package com.czc.pat.mooczice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/17/problems/262
 * 自测-3 数组元素循环右移问题 (20分)
 */
public class RightShiftArray {
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
//    private static void rightShiftArray(int[] array, int offset){
//        int span = array.length / offset;
//        for(int i = 0; i < offset; i++){
//            int temp = array[i],swap = 0;
//            for(int j = 0; j < span; j++){
//                int index = j * offset + i;
//                if(index < array.length - offset){
//                    swap = array[index + offset];
//                    array[index + offset] = temp;
//                    temp = swap;
//                }else{
//                    if(index==array.length){
//                        break;
//                    }else{
//                        array[(index + offset) % array.length] = temp;
//                    }
//                }
//            }
//        }
//    }

}

