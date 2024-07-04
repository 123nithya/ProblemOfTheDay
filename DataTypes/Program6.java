package PracticeQuestions.DataTypes;

/*
*   Write a Java program to compute the body mass index (BMI).
*   Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721
* */

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double inches = sc.nextDouble();

        double BMI = weight*0.45359237 / (inches*0.0254*inches*0.0254);
        System.out.println(BMI);
    }
}
