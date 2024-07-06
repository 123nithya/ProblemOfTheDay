package PracticeQuestions.ConditionalStatements;

import java.util.Scanner;

/*
* Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.

Test Data
Input an integer number less than ten billion: 125463
Expected Output :

Number of digits in the number: 6
* */
public class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long rem = 0,cnt = 0;
        while(n>0)
        {
            rem = n%10;
            cnt++;
            n/=10;
        }
        System.out.println(cnt);
    }
}
