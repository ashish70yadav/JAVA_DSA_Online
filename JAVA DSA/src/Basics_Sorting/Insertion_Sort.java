package Basics_Sorting;

public class Insertion_Sort {
    static void main(String[] args) {
        int [] arr = {12, 456 ,87, 31, 4 ,0 ,-96 ,-9, -63,89};
        for (int i = 1; i <arr.length; i++) {
            int j = i;
            while (j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] =arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int ele : arr) System.out.print(ele + "  ");
    }
}
