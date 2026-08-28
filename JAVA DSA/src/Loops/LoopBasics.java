package Loops;

import java.util.Scanner;
public class LoopBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: " );
        double n = sc.nextDouble();
        for (double i = 1; i <=n; i = i+1) {
            System.out.println("Hello Ashish");
        }
    }
}

