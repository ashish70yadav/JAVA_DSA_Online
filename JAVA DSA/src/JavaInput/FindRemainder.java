package JavaInput;

import java.util.Scanner;
public class FindRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend : ");
        int a =sc.nextInt();
        System.out.print("Enter Divisor : ");
        int b = sc.nextInt();
        int q = a / b;
        int r = a-(b*q);
        System.out.println( "The Remainder when "+a+ " is divided by "+b+" is "+r);


    }
}
