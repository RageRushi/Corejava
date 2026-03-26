package com.march26.conditions;

public class TerenaryOperator {
    public static void main(String[] args) {
// The ternary operator is a short form of if-else used to return a value based on a condition.
        int num1 = 6;
        int num2 = 4;

        int max = ( num1 > num2) ? num1:num2;
        System.out.println(max);
    }
}
