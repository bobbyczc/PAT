package com.czc.pat.basiclevel._1To15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805309963354112
 * 1013 数素数 (20分)
 *
 */
public class _1013_NumberPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), n = scanner.nextInt();
        ArrayList<Integer> primes = findNPrimes(n);
        int count = 1;
        StringBuilder builder = new StringBuilder().append(primes.get(m-1));
        for(int i = 0, size = primes.size(); i < size; i++){
            if(i >= m){
                if(count % 10 == 0){
                    builder.append("\n");
                }else{
                    builder.append(" ");
                }
                builder.append(primes.get(i));
                count++;
            }
        }
        System.out.println(builder.toString());
    }

    private static ArrayList<Integer> findNPrimes(int n){
        ArrayList<Integer> results = new ArrayList<>();
        for(int number = 2; results.size() < n; number++){
            if (isPrime(number)){
                results.add(number);
            }
        }
        return results;
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
