package Java_Interview_Questions;

/*
    Given an array of n positive integers as its argument. You are required to
    calculate the standard deviation of N positive integers in array and return
    the same.

    Standard deviation for data set arr[0],arr[1],arr[2]... is equal to the
    Sqrt{[(arr[0]-A)^2+(arr[1]-A)^2+.....]/N}, where A is the average of all
    the elements of the array. You are required to complete the
    StandardDeviation function which takes arr as input and return ans

    EXPLANATION:

    step-01: Find Average(A).
    step-02: Sum of difference.
    step-03: Sum/N.
    step:04: sqrt(Sum/N).


    IMPORTANT TOPICS FOR ACCENTURE QUESTIONS:

    -> Arrays
    -> Strings
    -> Mathematics (standard deviation, mean, median, mode)
    -> Number System (lcm, hcf)
    -> HashMap, Dictionary
*/

import java.util.Scanner;

public class AccenturePreviousYearQuestion01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        double ans = standardDeviation(arr,n);
        System.out.println(ans);
    }
    public static double standardDeviation(int arr[], int n)
    {
        double avg = 0;
        for(int i=0;i<n;i++)
        {
            avg+=arr[i];
        }
        avg/=n;
        double sumOfSqs = 0;
        for(int i=0;i<n;i++)
        {
            sumOfSqs+=Math.pow(arr[i]-avg,2);
        }
        double variance = sumOfSqs/n;
        return Math.sqrt(variance);
    }
}
