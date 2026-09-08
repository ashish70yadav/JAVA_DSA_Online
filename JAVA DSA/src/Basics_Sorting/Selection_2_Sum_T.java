package Basics_Sorting;

import java.util.Arrays;

public class Selection_2_Sum_T {
    static void main(String[] args) {
        int [] arr = {7,0,4,3,2,8,10};

        //  -----> Targer  = (sum of two element is 9 )

        int target = 9;
        int n = arr.length;

        // -----> Time Complexity  O(n*n) i.e n square.

//        for (int i = 0 ; i<n-1 ; i++){
//            for (int j = i; j < n-1 ; j++) {
//                if(arr[i] + arr[j] == target){
//                    System.out.println(" Sum of the element of Index "+i+" , "+j+" is "+ (arr[i]+arr[j]));
//                    break;
//                }
//            }
//        }


                //-------> Time Complexity is  O(n log n)
        Arrays.sort(arr);
        for (int ele : arr) System.out.print(ele+"  ");
        System.out.println();
        int i =0 , j =n-1;
        while (i<j){
            if(arr[i]+arr[j] == target ) {
                System.out.println(" Sum of the element of Index "+i+" , "+j+" is "+ (arr[i]+arr[j]));
                break;
            }
            else if(arr[i]+arr[j] > target ) j--;
            else i++;
        }
    }
}
