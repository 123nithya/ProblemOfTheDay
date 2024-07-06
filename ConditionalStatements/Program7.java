package PracticeQuestions.ConditionalStatements;

/*
     Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant
*/

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();

        boolean upperCase = str.charAt(0)>=65 && str.charAt(0)<=90;
        boolean lowerCase = str.charAt(0)>=97 && str.charAt(0)<=122;
        boolean vowels = str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u");

        if(str.length()>1)
        {
            System.out.println("Not a single character");
        }
        else if(!(upperCase || lowerCase))
        {
            System.out.println("Not a letter. Enter uppercase or lowercase");
        }
        else if(vowels)
        {
            System.out.println("Input letter is vowel");
        }
        else
        {
            System.out.println("Input letter is consonant");
        }
    }
}
