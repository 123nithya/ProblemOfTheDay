package PracticeQuestions.ConditionalStatements;

/*
5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

Test Data
Input number: 3
Expected Output :
Wednesday
* */

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String dayname = "";
        switch (n)
        {
            case 1: dayname="Monday";break;
            case 2: dayname="Tuesday";break;
            case 3: dayname="Wednesday";break;
            case 4: dayname="Thursday";break;
            case 5: dayname="Friday";break;
            case 6: dayname="Saturday";break;
            case 7: dayname="Sunday";break;
        }
        System.out.println(dayname);
    }
}
