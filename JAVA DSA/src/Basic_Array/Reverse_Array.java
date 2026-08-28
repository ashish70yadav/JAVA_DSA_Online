package Basic_Array;

import java.util.Scanner;

public class Reverse_Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int arr [] = new int [sc.nextInt()];
        System.out.print("Enter Array Element : ");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int i =0;
        int j =arr.length-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr)
            System.out.print(ele + " ");

              // we Use for Loop

//        for(int i =0 ,j =arr.length-1; i<j;i++,j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        for (int ele : arr)
//            System.out.print(ele + " ");

           //--> Now only Reverse the element for index 2 to 5
//        int a =2;
//        int b = 5;
//        while (a<b) {
//            int temp = arr[a];
//            arr[a] = arr[b];
//            arr[b] = temp;
//            a++;
//            b--;
//        }
//        for (int ele : arr)
//            System.out.print(ele + " ");
    }
}
