package PracticeQuestions.ConditionalStatements;

/*
*   2. Write a Java program to solve quadratic equations (use if, else if and else).

Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195
* */

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double res = b*b-4.0*a*c;
        if(res>0.0)
        {
            double ansOne = (-b+Math.pow(res,0.5))/(2.0*a);
            double ansTwo = (-b-Math.pow(res,0.5))/(2.0*a);
            System.out.print(ansOne+" "+ansTwo);
        }
        else if(res==0.0)
        {
            double ans = -b/(2.0*a);
            System.out.print(ans);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
