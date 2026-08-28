package Loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        boolean flag = true; // true means Prime.
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                flag = false; // false means Composite.
                break;
            }
        }
        if (n==1) System.out.println("nither Prime Nor Composite ");
        else if (flag==false)System.out.println("Composite Number");
        else System.out.println("Prime number");

        // Take a number input  and print all of its factor.
//
//        for (int i=1;i<=Math.sqrt(n);i++){
//            if (n%i==0) {
//                System.out.print(i + " ");
//                 if (i!=n/i)System.out.print(n/i+" ");
//            }
//        }
    }
}
