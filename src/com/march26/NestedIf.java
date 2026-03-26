package com.march26;

public class NestedIf {
    public static void main(String[] args) {

        // Use when: conditions depend on each other
        int x = 3;
        if (x > 0) {
            if (x % 2 == 0) {
                System.out.println("Positive Even");
            }
        }
    }
}
