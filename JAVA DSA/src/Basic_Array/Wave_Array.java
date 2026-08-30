package Basic_Array;

import java.util.Scanner;

public class Wave_Array {
    static void main(String[] args) {

        // -----> Arrray Input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int [] arr = new int[sc.nextInt()];
        System.out.println("Enter the Sorted Array Element : ");
        for (int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // -----> Wave Array

        for (int i = 0; i < arr.length; i+=2) {
            if(i== arr.length-1) break;
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int ele : arr){
            System.out.print(ele+ "  ");
        }
    }
}
