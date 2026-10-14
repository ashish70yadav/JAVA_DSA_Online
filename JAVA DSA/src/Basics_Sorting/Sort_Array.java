package Basics_Sorting;

public class Sort_Array {
    static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 3};

        // by Bubble Sort ...
//        for (int i = 0; i < arr.length-1 ; i++) {
//            boolean flag=  true;
//            for (int j = 0; j < arr.length-1-i; j++) {
//                if (arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    flag = false;
//                }
//
//            }
//            if (flag == true) break;
//        }



        // by Selection Sort...
//        for (int i = 0; i < arr.length; i++) {
//            int min = Integer.MAX_VALUE;
//            int mindx = 65858;
//            for (int j = i; j < arr.length; j++) {
//                if (arr[j] < min) {
//                    min = arr[j];
//                    mindx = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i]= arr[mindx];
//            arr[mindx] = temp;
//        }



        // by Insertion Sort...
        for (int i = 1; i < arr.length ; i++) {
            int j= i;
            while (j>0 && arr[j] < arr[j-1] ){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for (int ele : arr) System.out.print(ele + "  ");
    }
}

