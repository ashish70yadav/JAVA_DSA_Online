package Basic_Array;

public class ReverseMergeTwoSortedArray {
    static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 9};
        int[] brr = {3, 4, 7, 8, 10, 15, 18};
        System.out.println(arr.length);

        int[] crr = new int[arr.length + brr.length];
        for (int ele : crr) System.out.print(ele + "  ");
        System.out.println();
        merge(arr,brr,crr);
        for (int ele : crr) System.out.print(ele + "  ");
        System.out.println();
    }
    public static void merge(int [] arr, int [] brr, int [] crr){
        int i = arr.length-1, j = brr.length-1, k = crr.length-1;
        while(i>= 0 && j>=0){
            if(arr[i] > brr[j]){
                crr[k] = arr[i];
                i--;
            }
            else {
                crr[k] = brr[j];
                j--;
            }
            k--;
        }
        while(i>=0){
            crr[k]= arr[i];
            i--;
            k--;
        }
        while(j>=0){
            crr[k]= brr[j];
            j--;
            k--;
        }
    }
}
