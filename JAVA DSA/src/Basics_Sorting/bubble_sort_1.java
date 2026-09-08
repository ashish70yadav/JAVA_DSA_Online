package Basics_Sorting;

import java.sql.SQLOutput;
public class bubble_sort_1 {
    public static  void show(int [] arr){
        for (int ele : arr){
            System.out.print(ele+"  ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int [] brr = {10,-36,89,4,65,-36,-96,65,10,58};
        int n  =brr.length;
        System.out.print("No Sorting : ");
        show(brr);


        // --------> Method First or Bad Practice <-------
//        for (int i = 0; i < n - 1; i++) {
//            if (brr[i] > brr[i + 1]) {
//                int temp = brr[i];
//                brr[i] = brr[i + 1];
//                brr[i + 1] = temp;
//            }
//        }
//        System.out.print("After 1 Pass : ");
//        show(brr);
//
//        for (int i = 0; i < n - 1; i++) {
//            if (brr[i] > brr[i + 1]) {
//                int temp = brr[i];
//                brr[i] = brr[i + 1];
//                brr[i + 1] = temp;
//            }
//        }
//        System.out.print("After 2 Pass : ");
//        show(brr);
//
//        for (int i = 0; i < n - 1; i++) {
//            if (brr[i] > brr[i + 1]) {
//                int temp = brr[i];
//                brr[i] = brr[i + 1];
//                brr[i + 1] = temp;
//            }
//        }
//        System.out.print("After 3 Pass : ");
//        show(brr);
//
//        for (int i = 0; i < n - 1; i++) {
//            if (brr[i] > brr[i + 1]) {
//                int temp = brr[i];
//                brr[i] = brr[i + 1];
//                brr[i + 1] = temp;
//            }
//        }
//        System.out.print("After 4 Pass : ");
//        show(brr);
//
//        for (int i = 0; i < n - 1; i++) {
//            if (brr[i] > brr[i + 1]) {
//                int temp = brr[i];
//                brr[i] = brr[i + 1];
//                brr[i + 1] = temp;
//            }
//        }
//        System.out.print("After 5 Pass : ");
//        show(brr);
//
//        for (int i = 0; i < n - 1; i++) {
//            if (brr[i] > brr[i + 1]) {
//                int temp = brr[i];
//                brr[i] = brr[i + 1];
//                brr[i + 1] = temp;
//            }
//        }
//        System.out.print("After 6 Pass : ");
//        show(brr);
//
//        for (int i = 0; i < n - 1; i++) {
//            if (brr[i] > brr[i + 1]) {
//                int temp = brr[i];
//                brr[i] = brr[i + 1];
//                brr[i + 1] = temp;
//            }
//        }
//        System.out.print("After 7 Pass : ");
//        show(brr);
//
//        for (int i = 0; i < n - 1; i++) {
//            if (brr[i] > brr[i + 1]) {
//                int temp = brr[i];
//                brr[i] = brr[i + 1];
//                brr[i + 1] = temp;
//            }
//        }
//        System.out.print("After 8 Pass : ");
//        show(brr);
//
//        for (int i = 0; i < n - 1; i++) {
//            if (brr[i] > brr[i + 1]) {
//                int temp = brr[i];
//                brr[i] = brr[i + 1];
//                brr[i + 1] = temp;
//            }
//        }
//        System.out.print("After 9 Pass : ");
//        show(brr);
//
//        for (int i = 0; i < n - 1; i++) {
//            if (brr[i] > brr[i + 1]) {
//                int temp = brr[i];
//                brr[i] = brr[i + 1];
//                brr[i + 1] = temp;
//            }
//        }
//        System.out.println("Final Sorting is...");
//        System.out.print("After 10 Pass : ");
//        show(brr);


        System.out.println();
        // ---------> Method 2 or average Practice <--------
//        for(int i = 0 ; i<n-1 ; i++){
//            for(int j = 0 ; j<n-1 ; j++){
//                if(brr[j] > brr[j+1]){
//                    int  temp = brr[j];
//                    brr[j] = brr[j+1];
//                    brr[j+1] = temp;
//                }
//            }
//        }
//        System.out.print("After Sorting : ");
//        show(brr);


        System.out.println();
        //--------> Method 3 or it is better than the method 2 because it is the modification of method 2
//        for(int i = 0 ; i<n-1 ; i++){
//            for(int j = 0 ; j<n-1-i ; j++){
//                if(brr[j] > brr[j+1]){
//                    int  temp = brr[j];
//                    brr[j] = brr[j+1];
//                    brr[j+1] = temp;
//                }
//            }
//        }
//        System.out.print("After Sorting : ");
//        show(brr);


        System.out.println();
        // --------> Method 4 or it is better than the method 3 because it is the modification of method 3
        for(int i = 0 ; i<n-1 ; i++){
            boolean isSorted = true;;
//            int swap =0;
            for(int j = 0 ; j<n-1-i ; j++){
                if(brr[j] > brr[j+1]){
                    int  temp = brr[j];
                    brr[j] = brr[j+1];
                    brr[j+1] = temp;
                    isSorted = false;
//                    swap++;
                }
            }
            if (isSorted== true) break;
//            if (swap==0) break;

        }
        System.out.print("After Sorting : ");
        show(brr);

    }
}
