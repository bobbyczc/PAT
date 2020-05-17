package com.czc.pat.basiclevel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805317546655744
 * 1007 素数对猜想 (20分)
 *
 */
public class _1007_PrimePair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        ArrayList<Integer> primeList = initPrimeList(range);
        System.out.println(getPrimeConjectureCount(primeList));
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

