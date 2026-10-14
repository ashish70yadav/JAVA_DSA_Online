package Recursion_1;

import java.util.Scanner;

public class PrintOneToN {
//    static int n;
//    public static void Print(int x) {
//        if (x > n) return;
//        System.out.print(x + "  ");
//        Print(x + 1);
//    }
//
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        Print(1);
//    }


    public static void Display (int x , int n ){
        if(x>n) return;
        System.out.print(x);
        Display(x+1,n);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Display(1,n);
     }

}


