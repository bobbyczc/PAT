package com.czc.pat.basiclevel._16To30;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805305181847552
 * 1017 A除以B (20分)
 */
public class _1017_ADivideB {
    public static void main(String[] args) {
        String[] intput = new Scanner(System.in).nextLine().split(" ");
//        getQuotientAndRemainder(scanner.next(),scanner.nextInt());
        BigInteger integer = new BigInteger(intput[0]);
        BigInteger b = new BigInteger(intput[1]);
        System.out.println(integer.divide(b) + " " +integer.mod(b));

    }

    private static void getQuotientAndRemainder(String aStr, int b){
        StringBuilder quotientBuilder = new StringBuilder();
        int remainder = 0;
        int divisor, tempQ, tempR;
        for(int i = 0, length = aStr.length(); i < length; i++){
            divisor = remainder * 10 + aStr.charAt(i)- '0';
            quotientBuilder.append(divisor / b);
            remainder = divisor % b;
        }
        quotientBuilder.append(" ").append(remainder);
        if(quotientBuilder.charAt(0) == '0'){
            quotientBuilder.deleteCharAt(0);
        }
        System.out.println(quotientBuilder.toString());
    }

}
/**
 * BufferedReader 读取速度上快于Scanner
 */

//import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//        import java.math.BigInteger;
///**
// * https://pintia.cn/problem-sets/994805260223102976/problems/994805305181847552
// * 1017 A除以B (20分)
// */
//public class Main {
//    public static void main(String[] args) throws IOException {
//        String[] split = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
//        BigInteger A = new BigInteger(split[0]), B = new BigInteger(split[1]);
//        BigInteger[] result = A.divideAndRemainder(B); // 返回商和余
//        System.out.print(result[0] + " " + result[1]);
//    }
//
//}

