package Loops;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number ");
        int n = sc.nextInt();
        int Count = 0;
        if (n==0) n= 2; // n = any single digit number
        while (n!=0){
            n/=10;
            Count++;
        }
        System.out.println(Count);
    }
}
