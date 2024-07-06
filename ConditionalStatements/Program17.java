package PracticeQuestions.ConditionalStatements;

/*
     Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.

The pattern like :

1
2 3
4 5 6
7 8 9 10
*/

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(digit+" ");
                digit++;
            }
            System.out.println();
        }
    }
}
