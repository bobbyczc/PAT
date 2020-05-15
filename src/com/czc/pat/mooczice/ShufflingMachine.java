package com.czc.pat.mooczice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://pintia.cn/problem-sets/17/problems/264
 * 自测-5 Shuffling Machine (20分)
 *
 * Shuffling is a procedure used to randomize a deck of playing cards. Because standard shuffling techniques are seen as weak, and in order to avoid "inside jobs" where employees collaborate with gamblers by performing inadequate shuffles, many casinos employ automatic shuffling machines. Your task is to simulate a shuffling machine.
 * The machine shuffles a deck of 54 cards according to a given random order and repeats for a given number of times. It is assumed that the initial status of a card deck is in the following order:
 *
 * S1, S2, ..., S13,
 * H1, H2, ..., H13,
 * C1, C2, ..., C13,
 * D1, D2, ..., D13,
 * J1, J2
 * where "S" stands for "Spade", "H" for "Heart", "C" for "Club", "D" for "Diamond", and "J" for "Joker". A given order is a permutation of distinct integers in [1, 54]. If the number at the i-th position is j, it means to move the card from position i to position j. For example, suppose we only have 5 cards: S3, H5, C1, D13 and J2. Given a shuffling order {4, 2, 5, 3, 1}, the result will be: J2, H5, D13, S3, C1. If we are to repeat the shuffling again, the result will be: C1, H5, S3, J2, D13.
 *
 * Input Specification:
 * Each input file contains one test case. For each case, the first line contains a positive integer K (≤20) which is the number of repeat times. Then the next line contains the given order. All the numbers in a line are separated by a space.
 *
 * Output Specification:
 * For each test case, print the shuffling results in one line. All the cards are separated by a space, and there must be no extra space at the end of the line.
 */
public class ShufflingMachine {
    public static void main(String[] args) {
        String[] cards = {"S1", "S2" , "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "S11", "S12", "S13",
                "H1", "H2" , "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "H11", "H12", "H13",
                "C1", "C2" , "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "C11", "C12", "C13",
                "D1", "D2" , "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "D11", "D12", "D13",
                "J1", "J2" };
        Scanner scanner = new Scanner(System.in);
        int repeatTime = Integer.parseInt(scanner.nextLine());
        String orderStr = scanner.nextLine();
        String[] orderArr = orderStr.split(" ");
        while(repeatTime > 0){
            cards = shuffle(cards,orderArr);
            repeatTime--;
        }
        System.out.println(String.join(" ", cards));

    }

    private static String[] shuffle(String[] cards, String[] order){
        String[] result = new String[54];
        for(int i = 0 ; i < 54; i++){
            result[Integer.parseInt(order[i])-1] = cards[i];
        }
        return result;
    }
}


