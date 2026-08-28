package Basic_Array;

import java.util.Scanner;

public class Output_Input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    int [] arr = {28,235,456,896,456,25,636,-45,54,-526,524};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+"  ");
//        }

        // Default Values
//        int ashish [] = new int[8];
//        System.out.print("Array Default Element is: ");
//        for (int i = 0; i<ashish.length;i++){
//            System.out.print(ashish[i]+ "  ");
//        }

        // input
        System.out.print("Enter the Array Size: ");
        int aky [] = new int [sc.nextInt()];
        System.out.print("Enter Array Element : ");
        for(int i=0; i<aky.length;i++){
            aky[i]= sc.nextInt();
        }

        // Output or Print
        System.out.print("Array Element is : ");
        for (int i = 0; i <aky.length ; i++) {
            System.out.print(aky[i]+"  ");
        }
    }
}

