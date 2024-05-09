import java.util.*;
public class Pattern7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input value : ");
        int n = sc.nextInt();
//        If n=3
//        For the first row(0) there will be 2 spaces with one star and 2 space
//        For the second row(1) there will be 1 space with 3 stars and 1 space
//        For the third row(2) there will be 0 space with 5 stars and 0 space.

//        Therefore space = (n-i-1) [3-0-1 == 2space] and star = (2*i+1) [2*0+1 == 1star] and again space.
        for(int i=0;i<n;i++)
        {
//            space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
//             star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
//              space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
