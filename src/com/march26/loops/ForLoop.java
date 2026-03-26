package com.march26.loops;

public class ForLoop {
    public static void main(String[] args) {

        // Use when: You know how many times loop runs
        //Example: patterns, counting, arrays

        /*
            flow of for loop -
            1.Initialization → int i = 1 (runs only once)
            2.Condition check → i <= 3
            *If true → go inside loop
            *If false → exit loop
            3.Execute body → print i
            4.Update → i++
            5.Repeat from step 2
         */

        for (int i = 1; i <= 3; i++){
            System.out.println(i);
        }
    }
}
