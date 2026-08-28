package Basic_Array;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int aky [] = new int [sc.nextInt()];
        System.out.print("Enter Array Element : ");
        for(int i=0; i<aky.length;i++){
            aky[i]= sc.nextInt();
        }

        // Output or Print
        int sum =0;
        for (int i = 0; i <aky.length ; i++) {
            sum +=aky[i];
        }
        System.out.println("Sum = "+sum);
    }
}
