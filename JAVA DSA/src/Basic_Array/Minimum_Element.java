package Basic_Array;

import java.util.Scanner;

public class Minimum_Element {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int aky [] = new int [sc.nextInt()];
        System.out.print("Enter Array Element : ");
        for(int i=0; i<aky.length;i++){
            aky[i]= sc.nextInt();
        }

        // Output or Print
        int min = aky[0];
        for (int i = 0; i <aky.length ; i++) {
            if (min>aky[i]){
                min = aky[i];
            }
        }
        System.out.println("Minimum Element is : "+min);
    }
}
