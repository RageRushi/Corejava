package com.march26;

public class ElseIfLadder {
    public static void main(String[] args) {

        // Use when: multiple conditions
        int marks = 36;

        if ( marks >= 90){
            System.out.println("Grade A");
        } else if ( marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade c");
        } else if (marks >= 40) {
            System.out.println("Grade D");
        }else {
            System.out.println("Fail");
        }
    }
}
