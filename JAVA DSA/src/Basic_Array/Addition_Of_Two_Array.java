package Basic_Array;

import java.util.ArrayList;
import java.util.Collections;

// Return in Array List.
public class Addition_Of_Two_Array {
    static ArrayList<Integer> add(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();

//        int i = a.length - 1;
//        int j = b.length - 1;
//        int carry = 0;
//
//        while (i >= 0 || j >= 0 || carry > 0) {
//            int sum = carry;
//            if (i >= 0){
//                sum += a[i];
//                i--;
//            }
//            if (j >= 0){
//                sum += b[j];
//                j--;
//            }
//
//            ans.add(sum % 10);
//            carry = sum / 10;
//        }
//
//        Collections.reverse(ans);
//        return ans;


        // ---------> Using For Loops

        int carry = 0;
        for(int i = a.length-1, j = b.length-1; i>=0 || j>=0 || carry>0; ) {
            int sum = carry;
            if (i >= 0) {
                sum += a[i];
                i--;
            }
            if (j >= 0) {
                sum += b[j];
                j--;
            }
            ans.add(sum % 10);
            carry = sum / 10;
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6};
        System.out.println(add(a, b));
    }
}