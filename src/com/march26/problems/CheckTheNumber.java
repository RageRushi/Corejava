package com.march26.problems;

import java.util.Scanner;

// Question - Check if a number is positive, negative or zero (using if-else ladder).

public class CheckTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        double num = sc.nextDouble();

        if ( num == 0){
            System.out.println("Number is Zero");
        }else if( num > 0){
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }
    }
}
