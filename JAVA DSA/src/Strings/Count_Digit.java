package Strings;

import java.util.Scanner;

public class Count_Digit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an Integer Number ");
//        int n = sc.nextInt();

        System.out.println("Enter Double Number ");
        double n = sc.nextDouble();
        String str = "" + n;
        System.out.println("Length is "+str.length());
        System.out.println("Element is "+str);
    }
}
