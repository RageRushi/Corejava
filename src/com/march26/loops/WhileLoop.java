package com.march26.loops;

public class WhileLoop {
    public static void main(String[] args) {
        // Runs only if condition is true
        //👉 Use when: Number of iterations is unknown
        //Example: user input, conditions

        /*
            Flow of while loop
            1.nitialization (outside loop) → i = 1
            2.Condition check → i <= 3
            *If true → go inside
            *If false → exit
            3.Execute body
            4.Update inside loop → i++
            5.Repeat from step 2
         */

        int i = 1;
        while ( i <= 3){
            System.out.println(i);
            i++;
        }
    }
}
