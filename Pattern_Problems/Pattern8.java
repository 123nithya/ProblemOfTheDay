import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input value : ");
        int n = sc.nextInt();
//        The number of space is equal to the number of rows and the columns(*) is equal to the 2*n-(2*i+1)
//        That is: 2*3-(2*0+1) == 6-1 = 5 for the input(n) == 3;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<2*n-(2*i+1);j++)
            {
                System.out.print("*");
            }

            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
