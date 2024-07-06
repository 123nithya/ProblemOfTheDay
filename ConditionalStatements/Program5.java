package PracticeQuestions.ConditionalStatements;

/*
    Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different
*/

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        num1*=1000;
        num2*=1000;
        if(num1==num2)
        {
            System.out.println("They are same");
        }
        else {
            System.out.println("They are different");
        }
    }
}
