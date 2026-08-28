package Rivision;

import java.util.Scanner;

public class SidesOfTrianlge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first sides of triangle ");
        int x = sc.nextInt();
        System.out.print("Enter second sides of triangle ");
        int y = sc.nextInt();
        System.out.print("Enter first sides of triangle ");
        int z = sc.nextInt();
        if (x+y>z && x+z>y && y+z>x){
            System.out.println("the sides you entered is a triangle :");
        }
        else {
            System.out.println("the sides you entered is not a triangle ! ");
        }
    }
}

