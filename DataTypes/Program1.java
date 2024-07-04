package PracticeQuestions.DataTypes;

/*
*    Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
* */

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double celsius = (5*(n-32))/9;
        System.out.println(n+" degree Fahrenheit is equal to "+celsius+" in Celsius");
    }
}
