package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter any number :");
//        int n = sc.nextInt();
//        int a = 2 ,d = 3;
//        for (int i=1;i<=n;i++){
//            System.out.print(a+ " ");
//            a += d; // a = a+d;
//        }

        //    Q. Print this series 99,95,91,87,....upto all terms Which are positive
        for (int i=99;i>0;i-=4 ){
            System.out.print(i+ " ");

        }
    }
}
