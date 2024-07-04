package PracticeQuestions.DataTypes;

/*
*   Write a Java program to convert minutes into years and days.

Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days
* */

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        double minInYears = 60*24*365;

        Scanner sc = new Scanner(System.in);
        double min = sc.nextDouble();
        long year = (long)(min/minInYears);
        int days = (int) (min/60/24)%365;

        System.out.println((int)min+" minutes is approx. "+year+" years and "+days+" days.");
    }
}
