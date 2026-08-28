package Loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        // Display this GP 1,2,4,8,....upto 'n' terms
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value of n :");
//        int n = sc.nextInt();
//        int a = 1 , r = 2;
//        for (int i=1; i<=n;i++){
//            System.out.print(a+ " ");
//            a*=r;
//        }

        // Take 'n' as input from user and print  the following sequence. 1, n, n-1, 3, n-2......

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int a = 1, r=1;
        for (int i=1; i<=n;i++) {
            System.out.println(i);
            System.out.println(n);
            n = n - 1;
        }
    }
}
