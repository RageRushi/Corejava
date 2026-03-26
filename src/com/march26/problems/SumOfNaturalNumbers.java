package com.march26.problems;

import java.util.Scanner;
// Print sum of first N natural numbers (user input).

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int num = sc.nextInt();
        int sum = 0;

        int i = 1;
        while ( i <= num){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of First N numbers is "+sum);
    }
}
