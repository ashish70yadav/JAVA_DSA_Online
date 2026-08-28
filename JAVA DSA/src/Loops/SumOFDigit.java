package Loops;
import java.util.Scanner;
public class SumOFDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number ");
        int n = sc.nextInt();
        int Sum = 0;
        if (n<0) n= -n; // only for  negative number
        while(n!=0){
            Sum+=n%10;
            n/=10;
        }
//        for (;n!=0;n=n/10){
//            Sum+=n%10;
//        }
        System.out.println("Sum= "+Sum);
    }
}

