package com.march26.loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        // Runs at least once, even if condition is false
        // Use when: You want code to run minimum one time
        //Example: menu-driven programs

        /*
            Flow of do while loop-
            1.Initialization → i = 1
            2.Execute body first (no condition check yet)
            3.Update → i++
            4.Condition check → i <= 3
            *If true → repeat
            *If false → stop
         */

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= 3);
    }
}
