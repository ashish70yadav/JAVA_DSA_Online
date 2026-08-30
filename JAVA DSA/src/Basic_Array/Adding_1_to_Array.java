package Basic_Array;

import java.util.Collections;
import java.util.Vector;


public class Adding_1_to_Array {
    public static Vector<Integer> AddOne(){
        int [] arr = {5 , 8, 7,9, 9 , 9};
        Vector<Integer> ans  = new Vector<>();
        int n = arr.length;
        int carry = 1;
        for (int i =n-1;i>=0;i--){
            if (arr[i]+carry<=9){
                ans.add(arr[i]+carry);
                carry=0;
            }
            else{
                ans.add(0);
                carry= 1;
            }
        }
        if(carry==1) ans.add(1);
        Collections.reverse(ans);
        return ans;

    }
    static void main(String[] args) {
        System.out.println(AddOne());
    }
}
