package Basics_Sorting;

public class Insertion_Sort_2 {
    static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        // if array is already sort then its time complexity is O(n).
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
