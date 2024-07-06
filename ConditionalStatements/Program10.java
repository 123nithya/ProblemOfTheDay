package PracticeQuestions.ConditionalStatements;

/*
     Write a Java program to display n terms of natural numbers and their sum.

Test Data
Input the number: 2
Expected Output :

Input number:
2
The first n natural numbers are :
2
1
2
The Sum of Natural Number upto n terms :
23
*/

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
