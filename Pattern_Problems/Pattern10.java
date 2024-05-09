import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input value : ");
        int n = sc.nextInt();
        /*
            In this pattern the if n=5 means
            the first 5 rows will print the same number of rows and as of n and column will print the stars until i;
            the total number of rows is 9 so the no.of rows is 2*n-1;
            and temp we are giving the i to stars to print the first n number of rows.
            and to print the n+1 row the formula varies (i.e) if i(row) exceeds n means then stars will be 2*n-i;

            (i.e) n==5 according to the qn
            and row(i == 6) exceeds n
            if(6>5) { stars = 2*5 - 6 == 10-6 == 4}
            therefore it prints 4 stars for the n+1 rows and redues until the last.
        */
        for(int i=1;i<=(2*n-1);i++)
        {
            int stars =i;
            if(i>n) {
                stars = 2 * n - i;
            }
            for(int j=1;j<=stars;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
