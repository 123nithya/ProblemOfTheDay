package PracticeQuestions.DataTypes;

import java.util.Scanner;

/*
*   Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804
* */

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();

        double time = (hours*3600)+(minutes*60)+seconds;
        double mps = distance/time;
        double kph = (distance*1000.0f)/(time*3600.0f);
        double mph = kph/1.609f;

        System.out.println(mps+" "+kph+" "+mph);
    }
}
