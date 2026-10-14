package Multi_Dimensional_Arrays;

public class ReverseRows_Columns {
    static void main(String[] args) {
        int [] [] arr ={{2,3,4,6,8},{6,9,8,4,5},{3,4,5,4,6},{3,2,1,5,4}};
        for (int i = 0; i < arr.length; i++) {
            int col = arr[0].length;
            for (int j = 0; j <= col ; j++) {
                int temp = arr[i] [j];
                arr[i][j] = arr[i][col-1];
                arr[i][col-1] = temp;
                col--;
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            int row = arr.length;
            for (int i = 0; i <=row; i++) {
                int temp = arr[i][j];
                arr[i][j] = arr[row-1][j];
                arr[row-1][j] = temp;
                row--;
            }

        }

        for (int [] a : arr){
            for (int ele:a){
                System.out.print(ele +"  ");
            }
            System.out.println();
        }
    }
}
