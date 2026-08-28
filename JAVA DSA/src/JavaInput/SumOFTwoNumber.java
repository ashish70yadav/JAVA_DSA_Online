package JavaInput;

import java.util.Scanner;
public class SumOFTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int x = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int y =sc.nextInt();
        int Sum =  x + y ;
        System.out.println("Sum = " +Sum);

        // for Find Square
        System.out.print("Enter A Number : ");
        int z = sc.nextInt();
        System.out.println("Square = " +z*z);

    }
}
