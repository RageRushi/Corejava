package com.march26.problems;

// Print multiplication table of a given number from 1 to 10.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int sum;

        for ( int i = 1; i <= 10; i++){
            sum = i * num;
            System.out.println(sum);
        }
    }
}
