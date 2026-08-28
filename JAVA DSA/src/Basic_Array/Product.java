package Basic_Array;

import java.util.Scanner;

public class Product {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int aky[] = new int[sc.nextInt()];
        System.out.print("Enter Array Element : ");
        for (int i = 0; i < aky.length; i++) {
            aky[i] = sc.nextInt();
        }

        // Output or Print
        int mul = 1;
        for (int i = 0; i < aky.length; i++) {
            mul *= aky[i];
        }
        System.out.println("Product is = " + mul);
    }
}
