package Rivision;

public class RotateArray {
    static void main(String[] args) {
        int arr [] = {1 , 2 , 3 , 4 , 5, 6};
        int n =arr.length;
        int rem = arr[n-1];
        for (int j = n-1; j > 0 ; j--) {
            arr[j] = arr[j-1];
        }
        arr[0] = rem;
        for(int ele : arr) System.out.print(ele+" ");
    }
}