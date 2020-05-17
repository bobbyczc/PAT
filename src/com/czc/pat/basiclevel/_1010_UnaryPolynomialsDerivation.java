package com.czc.pat.basiclevel;

import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805313708867584
 * 1010 一元多项式求导 (25分)
 * 设计函数求一元多项式的导数。（注：x
 * ​n
 * ​​ （n为整数）的一阶导数为nx
 * ​n−1
 * ​​ 。）
 *
 * 输入格式:
 * 以指数递降方式输入多项式非零项系数和指数（绝对值均为不超过 1000 的整数）。数字间以空格分隔。
 *
 * 输出格式:
 * 以与输入相同的格式输出导数多项式非零项的系数和指数。数字间以空格分隔，但结尾不能有多余空格。注意“零多项式”的指数和系数都是 0，但是表示为 0 0。
 *
 * 输入样例:
 * 3 4 -5 2 6 1 -2 0
 * 输出样例:
 * 12 3 -10 1 6 0
 */
public class _1010_UnaryPolynomialsDerivation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] init = toIntArray(scanner.nextLine().split(" "));
        System.out.println(calculateDerivation(init));

    }

    private static String calculateDerivation(int[] init){
        StringBuilder sb = new StringBuilder();
        if(init[0] == 0){
            return "0 0";
        }
        for(int i = 0; i < init.length-1; i += 2){
            init[i] = init[i] * init[i+1];
            init[i+1] = init[i+1] - 1;
            if(init[i+1] != -1){
                sb.append(init[i]).append(" ").append(init[i+1]).append(" ");
            }
        }
        return sb.deleteCharAt(sb.lastIndexOf(" ")).toString();
    }

    private static int[] toIntArray(String[] strings){
        int[] result = new int[strings.length];
        for(int i = 0; i < strings.length; i++){
            result[i] = Integer.parseInt(strings[i]);
        }
        return result;
    }
}
