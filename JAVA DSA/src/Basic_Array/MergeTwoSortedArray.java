package Basic_Array;


public class MergeTwoSortedArray {
    static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 9};
        int[] brr = {3, 4, 7, 8, 10, 15, 18};

        int[] crr = new int[arr.length + brr.length];
        for (int ele : crr) System.out.print(ele + "  ");
        System.out.println();

        merge(arr, brr, crr);
        for (int ele : crr) System.out.print(ele + "  ");
        System.out.println();
    }

    public static void merge(int[] arr, int[] brr, int[] crr) {
        int i = 0, j = 0, k = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                crr[k] = arr[i];
                i++;
            } else {
                crr[k] = brr[j];
                j++;
            }
            k++;
        }

        while (i < arr.length) {
            crr[k] = arr[i];
            i++;
            k++;
        }
        while (j < brr.length) {
            crr[k] = brr[j];
            j++;
            k++;
        }
    }
}

