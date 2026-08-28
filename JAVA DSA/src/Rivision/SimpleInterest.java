package Rivision;
import java.util.Scanner;
public class SimpleInterest {
    public static void main (String[] args ){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the value of Principle Amount : ");
        double p = sc.nextDouble();
        System.out.print("Enter the value of Rate : ");
        double r = sc.nextDouble();
        System.out.print("Enter the time : ");
        double t = sc.nextDouble();

        System.out.print("Simple Interest = "+(p*r*t)/100.0);
    }
}

