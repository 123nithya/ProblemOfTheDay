package PracticeQuestions.ConditionalStatements;

/*
     Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :


Input the 5 numbers :
1
2
3
4
5
The sum of 5 no is : 15
The Average is : 3.0
*/

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0,avg = 0;
        for(int i=1;i<=5;i++)
        {
            n = sc.nextInt();
            sum+=n;
        }
        avg = sum/5;
        System.out.print(sum+" "+avg);
    }
}
