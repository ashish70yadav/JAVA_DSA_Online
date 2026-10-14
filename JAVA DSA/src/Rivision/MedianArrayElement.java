package Rivision;

public class MedianArrayElement {
    static void main(String[] args) {
        int nums1 [] = {1,2};
        int nums2 [] = {3,4};
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        System.out.println("Merge Sorted Array:");
        for (int ele : arr) System.out.print(ele +"  ");
        System.out.println();
        int mid = arr.length/2;
        if((arr.length%2)==0){
            double p = arr[mid]+arr[mid-1];
            System.out.println("Median Element "+ p/2);
        }
        else System.out.println("Median Element "+arr[mid]);
    }
}