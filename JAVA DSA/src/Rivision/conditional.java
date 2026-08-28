package Rivision;

// if the ages of Ram , shyam and ajay are input through the keyboard, write a program to determine the youngest of the three.

import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ram's age :");
        int a = sc.nextInt();
        System.out.println("Enter shyam's age :");
        int b = sc.nextInt();
        System.out.println("Enter ajay's age :");
        int c = sc.nextInt();

//        if (a<b && a<c){
//            System.out.println("Ram is youngest ");
//        }
//        else if (b<a && b<c){
//            System.out.println("Shyam is youngest ");
//        }
//        else {
//            System.out.println("Ajay is youngest ");
//        }
        // ---> method 2
        if (a < b) {
            if (a < c) {
                System.out.println("Ram is youngest ");
            } else {
                System.out.println("Ajay is youngest ");
            }
        } else {
            if (b < c) {
                System.out.println("Shyam is youngest ");
            } else {
                System.out.println("Ajay is youngest ");
            }
        }

//  // Take positive integer input and tell if it is divisible by 5 and 3.
//        System.out.println("Enter a Number :");
//        int a = sc.nextInt();
//        if (a%5==0 && a%3==0){
//            System.out.println("The number you entered is divisible by both 3 and 5 :");
//        }
//        else {
//            System.out.println("The number you entered is not  divisible by both 3 and 5 !");
//        }
//
// // Take 3 positive integers input and print the greatest of them .
//        System.out.println("Enter first positive integer ");
//        int a = sc.nextInt();
//        System.out.println("Enter second positive integer ");
//        int b = sc.nextInt();
//        System.out.println("Enter third positive integer ");
//        int c = sc.nextInt();
//        if (a>b && a>c){
//            System.out.println(a+" is greatest ");
//        }
//        else if (b>a && b>c) {
//            System.out.println(b+" is greatest ");
//        }
//        else {
//            System.out.println(c+" is greatest ");
//        }
    }
}

