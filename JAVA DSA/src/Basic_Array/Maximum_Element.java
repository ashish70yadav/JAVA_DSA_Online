package Basic_Array;

import java.util.Scanner;

public class Maximum_Element {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int aky [] = new int [sc.nextInt()];
        System.out.print("Enter Array Element : ");
        for(int i=0; i<aky.length;i++){
            aky[i]= sc.nextInt();
        }

        // Output or Print
        int max = aky[0];
        for (int i = 0; i <aky.length ; i++) {
            if (max<aky[i]){
                max = aky[i];
            }
        }
        System.out.println("Maximum Element is : "+max);
    }
}
