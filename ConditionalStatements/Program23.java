package PracticeQuestions.ConditionalStatements;

/*
* Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.

Test Data
Input first number: 2564
Input second number: 3526
Input third number: 2456
Expected Output :

All numbers are different
* */

import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && a==c && b==c)
        {
            System.out.println("All are equal");
        }
        else if((a==b) || (b==c) || (a==c))
        {
            System.out.println("Neither all are equal nor different");
        }
        else
        {
            System.out.println("All are different");
        }
    }
}
