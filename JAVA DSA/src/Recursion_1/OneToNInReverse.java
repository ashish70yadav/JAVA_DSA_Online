package Recursion_1;

import java.util.Scanner;

public class OneToNInReverse {
    public static void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
        if(n!=1){
            System.out.print(n+" ");
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number : ");
        int n = sc.nextInt();
        print(n);
    }
}
