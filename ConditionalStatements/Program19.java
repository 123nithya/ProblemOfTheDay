package PracticeQuestions.ConditionalStatements;

/*
     Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

       1
      2 2
     3 3 3
    4 4 4 4
Test Data
Input number of rows : 4
*/

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

//        OR

//        int space = n+4-1;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=space;j!=0;j--)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//            space--;
//        }
    }
}
