package PracticeQuestions.ConditionalStatements;
/*
*   Write a Java program that takes three numbers from the user and prints the greatest number.

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
* */

import java.util.Scanner;

public class PRogram3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if(b>a && b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}
