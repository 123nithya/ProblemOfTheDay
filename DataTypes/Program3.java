package PracticeQuestions.DataTypes;

/*
*   Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
* */

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if(n>0 && n<1000)
        {
            while(n!=0)
            {
                int rem = n%10;
                sum+=rem;
                n/=10;
            }
        }
        System.out.println(sum);
    }
}
