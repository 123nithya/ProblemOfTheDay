package Java_Interview_Questions;

/*
    For a given 3 digit number, find whether it is armstrong number
    or not. An armstrong number of three digit is an integer such that the
    sum of the cubes of its digits is equal to the number itself. Return "Yes"
    if it is a armstrong number else return  "NO";

    EXAMPLE:
    input: N = 153
    output: "Yes"

    Explanation: 153 is a armstrong number
    since 1^3+5^3+3^3 = 153.
    answer = yes.

    input: N = 370
    output: "Yes"
*/

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        armStrongNumber(n);
    }
    public static void armStrongNumber(int n)
    {
        int sum = 0;
        int temp = n;
        while(n!=0)
        {
            int rem = n%10;
            sum += Math.pow(rem,3);
            n/=10;
        }
        if(sum == temp)
        {
            System.out.print("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
