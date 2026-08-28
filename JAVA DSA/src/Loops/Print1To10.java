package Loops;
import java.util.Scanner;
public class Print1To10 {
    public static void main(String[] args) {
//        for (int i =2; i<=100;i++){
//           if (i%2==0)System.out.println(i);
//        }
        // Print all odd number divisible by 3 from 1 to 100.
//        for (int i = 3; i <=100; i=i+3) {
//            System.out.print(i+" ");

        // print number from 'n' to 1.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
//        for(int i=n;i>=1;i--){
//            System.out.println(i);
//        }

        for (int i=2;i<=(3*n)-1;i+=3){
            System.out.println(i);
        }
    }
}



