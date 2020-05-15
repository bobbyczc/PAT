package com.czc.pat.mooczice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/17/problems/261
 * 自测-2 素数对猜想 (20分)
 * 让我们定义dn为：dn=pn+1−pn，其中p​i 是第i个素数。显然有d​1=1，且对于n>1有d​n是偶数。“素数对猜想”认为“存在无穷多对相邻且差为2的素数”。
 * 现给定任意正整数N(<10^5)，请计算不超过N的满足猜想的素数对的个数。
 */
public class PrimeConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        ArrayList<Integer> primelist = initPrimeList(range);
        System.out.println(getPrimeConjectureCount(primelist));
    }

    private static int getPrimeConjectureCount(ArrayList<Integer> primeList){
        int count = 0;
        if(primeList.size() == 1){
            return count;
        }
        for(int i = 0; i <primeList.size()-1; i++){
            if(primeList.get(i+1)-primeList.get(i)==2){
                count++;
            }
        }
        return count;
    }

    private static ArrayList<Integer> initPrimeList(int range){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 2; i <= range; i++){
            if(isPrime(i)){
                result.add(i);
            }
        }
        return result;
    }

    private static boolean isPrime(int number){
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
