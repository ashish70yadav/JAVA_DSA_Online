package Rivision;

import java.util.Scanner;

public class Largest_Element_Array {
    public int[] ArrayElement(int[] brr) {
        int max = brr[0];
        int min = brr[0];
      
        for (int i = 0; i <brr.length; i++) {

            if (brr[i] > max) {
                max = brr[i];
            }
            if (brr[i] < min) {
                min = brr[i];
            }
        }
        int[] result = new int[2];
        result[0] = min;
        result[1] = max;

        return result;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Array Element : " );
        for (int i = 0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
            Largest_Element_Array  obj = new Largest_Element_Array();
            int[] ans = obj.ArrayElement(arr);
            System.out.println("minimum Element is : "+ans[0]);
            System.out.println("maximum Element is : "+ans[1]);
    }
}
