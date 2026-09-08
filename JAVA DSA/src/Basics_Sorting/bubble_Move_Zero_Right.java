package Basics_Sorting;

public class bubble_Move_Zero_Right {
    public static void Print(int [] arr){
        for (int ele : arr){
            System.out.print(ele + "  ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int [] arr = {-2,45,0,-6,8,0,9,4,0,-3,5,0,7};
        int n = arr.length;
        for(int i = 0; i<n-1; i++) {
            int swap = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap==0) break;
        }
        Print(arr);
    }
}
