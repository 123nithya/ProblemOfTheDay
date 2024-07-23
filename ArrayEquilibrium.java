package Java_Interview_Questions;

/*
*   The function accepts an integer array ‘arr’ of size ‘n’ as its argument. The
* function needs to return the index of an equilibrium point in the array, where
* the sum of elements on the left of the index is equal to the sum of elements
* on the right of the index. If no equilibrium point exists, the function should
* return -1.
*
* input:
*   n = 5
*   arr = 1 3 5 7 3
*
* output: 3
* */

import java.util.Scanner;

public class ArrayEquilibrium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(equilibrium(arr,n));
    }
    public static int equilibrium(int arr[], int n)
    {
        int left = 0,right = 0;
        for(int i=0;i<n;i++)
        {
            left = 0;
            for(int j=0;j<i;j++)
            {
                left+=arr[j];
            }
            right=0;
            for(int j = i+1;j<n;j++)
            {
                right+=arr[j];
            }

            if(left == right)
            {
                return i+1;
            }
        }
        return -1;
    }
}
