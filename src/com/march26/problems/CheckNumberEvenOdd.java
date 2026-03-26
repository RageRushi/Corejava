package com.march26.problems;

import java.util.Scanner;
// Check if a number is even or odd using if-else (with user input via Scanner).

public class CheckNumberEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if ( num % 2 == 0){
            System.out.println("The number is even");
        }else {
            System.out.println("the number is odd");
        }
    }
}
