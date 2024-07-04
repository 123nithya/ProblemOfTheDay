package PracticeQuestions.DataTypes;

import java.util.Scanner;

/*
*   Write a Java program that prints the current time in GMT.

Test Data
Input the time zone offset to GMT: 256
Expected Output:
Current time is 23:40:24
* */
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long timeZoneChange = sc.nextInt();
        long totalMilliSec = System.currentTimeMillis();

        long totalSeconds = totalMilliSec/1000;
        long currentSeconds = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinute = totalMinutes%60;
        long totalHours = totalMinutes/60;

        long currentHour = ((totalHours+timeZoneChange)%24);
        System.out.println("Current Time is "+currentHour+":"+currentMinute+":"+currentSeconds);
    }
}
