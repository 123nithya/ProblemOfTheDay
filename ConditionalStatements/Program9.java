package PracticeQuestions.ConditionalStatements;

import java.util.Scanner;

/*
     Write a Java program to display the first 10 natural numbers.

Expected Output :

The first 10 natural numbers are:

1
2
3
4
5
6
7
8
9
10
*/

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10;i++)
        {
            System.out.print(i+" ");
        }
    }
}
