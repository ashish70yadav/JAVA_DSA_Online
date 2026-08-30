package Basic_Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJavaBasics {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(5);
//
//        System.out.println(arr.get(2)); // arr[2]
//        arr.set(2,50);
//        System.out.println(arr); // print all element. but Not Traversing the array by ourselves
//        // ------> Or
//        int n = arr.size();// arr.length
//        for (int i = 0 ; i<n ; i++){
//            System.out.print(arr.get(i)+ "  ");
//        }
//        System.out.println();
//        //  -------> Or
//        for (int ele : arr){
//            System.out.print(ele+"  ");
//        }

        arr.add(2,25); // element add in some specific position
        System.out.println(arr);
        arr.add(50); // element add in last element
        System.out.println(arr);
        arr.remove(3); // Element remove in some Secific position
        System.out.println(arr);
        arr.remove(arr.size()-1); // last element remove
        System.out.println(arr);
        Collections.reverse(arr);// reverse the array element
        System.out.println(arr);
        // -----> Or Reverse Array Element
        int  i =0, j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
