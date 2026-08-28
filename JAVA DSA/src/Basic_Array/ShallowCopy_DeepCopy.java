package Basic_Array;

import java.util.Arrays;

public class ShallowCopy_DeepCopy {
    static void main(String[] args) {
        int []arr = {10,20,40,50,46,3,45,86,101};
        int [] brr =arr; // brr is shallow Copy of arr .
        brr [2]= -20;
        System.out.println(arr[2]);

        int crr [] = Arrays.copyOf(arr,arr.length);
        crr [3]= -98;
        System.out.println(arr[3]);
        System.out.println(crr[3]);
    }
}
