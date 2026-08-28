package Basic_Array;

import java.util.Arrays;

public class Sort_Array_BuiltIn {
    static void main(String[] args) {
        // Sorting Ascending Order.
        int arr[]= {20,56,-46,96,-12,-78,658};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    static void print(int[]brr) {
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+"  ");
        }
        System.out.println();
    }
}
