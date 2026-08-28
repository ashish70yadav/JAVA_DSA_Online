package Basic_Array;

import java.util.Scanner;

public class P_Negative {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int aky [] = new int [sc.nextInt()];
        System.out.print("Enter Array Element : ");
        for(int i=0; i<aky.length;i++){
            aky[i]= sc.nextInt();
        }

        // Print Negative Element
        System.out.print("Array Element is : ");
        for (int i = 0; i <aky.length ; i++) {
            if(aky[i]<0) System.out.print(aky[i]+"  ");
        }
    }
}
