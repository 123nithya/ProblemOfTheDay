package PracticeQuestions.ConditionalStatements;

/*
    Write a Java program that displays the sum of n odd natural numbers.

Test Data
Input number of terms is: 5
Expected Output :

The odd numbers are :
1
3
5
7
9
The Sum of odd Natural Number upto 5 terms is: 25
*/

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print((2*i-1)+" ");
            sum+=(2*i-1);
        }
        System.out.println();
        System.out.print(sum);
    }
}
