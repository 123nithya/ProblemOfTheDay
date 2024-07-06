package PracticeQuestions.ConditionalStatements;

/*
*   1. Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive
* */

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
        {
            System.out.println("Number is Positive");
        }
        else if(n<0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("The given number is Zero");
        }
    }
}
