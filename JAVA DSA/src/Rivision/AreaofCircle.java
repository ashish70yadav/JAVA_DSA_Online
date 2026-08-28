package Rivision;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print ("Enter the Radius ");
        float r =sc.nextFloat();
        float AOC = 3.14f*r*r;
        System.out.println("Area of Circle is"+AOC);
    }
}

