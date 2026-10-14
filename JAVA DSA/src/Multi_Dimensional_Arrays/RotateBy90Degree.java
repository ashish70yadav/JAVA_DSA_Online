package Multi_Dimensional_Arrays;

public class RotateBy90Degree {
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
        System.out.println("Before Rotate By 90 Degree : ");
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <i; j++) {
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i] = temp;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            int col = arr[0].length;
            for (int j = 0; j < col ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][col-1];
                arr[i] [col-1]= temp;
                col--;
            }
        }
        System.out.println("After Rotate by 90 Degree : ");
        print(arr);

    }
}
