package Basic_Array;

import java.util.Scanner;

public class Second_Max_Elements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int aky [] = new int [sc.nextInt()];
        System.out.print("Enter Array Element : ");
        for(int i=0; i<aky.length;i++){
            aky[i]= sc.nextInt();
        }

        // Calculate Maximum Element.
        int max = aky[0];
        for (int i = 0; i <aky.length ; i++) {
            if (max<aky[i]){
                max = aky[i];
            }
        }
        System.out.println("Maximum Element is : "+max);

        // Calculate Second Maximum Element.
        int Sec_max = aky[0];
        for (int i = 0; i < aky.length; i++) {
            if (aky[i]>Sec_max && aky[i] != max){
                Sec_max = aky [i];
            }
        }
        System.out.println("Second Maximum Element is : "+Sec_max);
    }
}
