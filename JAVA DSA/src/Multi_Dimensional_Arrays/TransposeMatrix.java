package Multi_Dimensional_Arrays;

public class TransposeMatrix {
    private static void print (int arr[][]){
        for (int [] a : arr){
            for (int ele :a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        int [] [] arr ={{2,3,4,6},{6,9,8,4},{3,4,5,4},{3,2,1,5}};
        System.out.println("Before Traanspose The Array");
        print(arr);
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j <i; j++) {
//                int temp = arr[i][j];
//                arr[i][j]= arr[j][i];
//                arr[j][i] = temp;
//
//            }
//        }
//        System.out.println("After Transpose The Array ");
//        print(arr);


        int row = arr.length , col = arr[0].length;
        int [][] brr = new int [col] [row];
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[0].length; j++) {
                brr[i][j] = arr[j][i];
            }
        }
        System.out.println("After Transpose The Array : ");
        print(brr);
    }
}
