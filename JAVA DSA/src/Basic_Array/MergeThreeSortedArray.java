package Basic_Array;

public class MergeThreeSortedArray {
    static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 9};
        int[] brr = {3, 4, 7, 8, 10, 15, 18};
        int[] crr = {3, 6,9,12,15,16,20};
        int[] mrr = new int[arr.length+ brr.length+ crr.length];
        for (int ele : mrr) System.out.print( ele +"  ");
        System.out.println();
        merge(arr,brr,crr,mrr);
        for (int ele : mrr) System.out.print( ele +"  ");
        System.out.println();
    }
    public static void merge (int [] arr, int [] brr, int [] crr,int [] mrr) {
        int i = 0, j = 0, k = 0, l = 0;
        // arr = i , brr = j , crr = k , mrr = l
//        while (i < arr.length && j < brr.length && k < crr.length) {
//            if(arr[i]<brr[j] && arr[i]<crr[k]){
//                if (arr[i]<crr[k]){
//                    mrr[l] = arr[i];
//                    i++;
//                }
//                else{
//                    mrr[l] = crr[k];
//                    k++;
//                }
//                l++;
//            }
//            else{
//                if (brr[j]<crr[k]){
//                    mrr[l] = brr[j];
//                    j++;
//                }
//                else{
//                    mrr[l] = crr[k];
//                    k++;
//                }
//                l++;
//            }
//        }
//        while (i < arr.length && j < brr.length) {
//            if (arr[i] < brr[j]) {
//                mrr[l] = arr[i];
//                i++;
//            } else {
//                mrr[l] = brr[j];
//                j++;
//            }
//            l++;
//        }
//        while (i < arr.length && k < crr.length) {
//            if (arr[i] < crr[k]) {
//                mrr[l] = arr[i];
//                i++;
//            } else {
//                mrr[l] = crr[k];
//                k++;
//            }
//            l++;
//        }
//        while (j < brr.length && k < crr.length) {
//            if (brr[j] < crr[k]) {
//                mrr[l] = brr[j];
//                j++;
//            } else {
//                mrr[l] = crr[k];
//                k++;
//            }
//            l++;
//        }
//        while (i < arr.length) {
//            mrr[l] = arr[i];
//            i++;
//            l++;
//        }
//        while (j < brr.length) {
//            mrr[l] = brr[j];
//            j++;
//            l++;
//        }
//        while (k < crr.length) {
//            mrr[l] = crr[k];
//            k++;
//            l++;
//        }

        //  ------>  OR <-----


    }
}
