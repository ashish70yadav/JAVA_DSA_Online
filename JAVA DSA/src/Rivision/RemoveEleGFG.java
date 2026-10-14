package Rivision;

public class RemoveEleGFG {
    static void main(String[] args) {
        int nums [] = {3,2,2,3};
        int val = 3;
        int n = nums.length;
        int v = nums[val];
        int count=0;
        for (int i = 0; i < n; i++) {
            if (v== nums[i]){
                count ++;
            }

        }
        int arr [] = new int [n-count];
        int  i =0 , j =0;
        while(i< n && j<n){
            if(v != nums[i]){
                arr[j] = nums[i];
                i++;
                j++;
            }
            else i++;
        }
        System.out.println(arr.length);
        for (int ele : arr) System.out.print(ele+"  ");
    }
}