package Rivision;

import java.util.Scanner;

public class FactUsingRecursion {
    static int fact = 1;
    public static int PrintFact(int a){
        if (a==0 || a==1) return 1;
        PrintFact(a-1);
        fact *= a;
        return fact;

    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Integer Number : ");
        int n = sc.nextInt();
        int ans = PrintFact(n);
        System.out.println("Factorial =  "+ans);
    }
}
