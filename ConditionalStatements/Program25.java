package PracticeQuestions.ConditionalStatements;

/*
*   Write a Java program that accepts two floatingpoint numbers and checks whether they are the same up to two decimal places.

Test Data
Input first floatingpoint number: 1235
Input second floatingpoint number: 2534
Expected Output :

These numbers are different.
* */

import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if(Math.abs(num1-num2)<=0.01)
        {
            System.out.println("They are same");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
