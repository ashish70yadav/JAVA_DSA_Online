package Multi_Dimensional_Arrays;

public class Multiplymatrix {
    static void main(String[] args) {
//        int arr [][] = {{3, 5, -3},{3, -4, 6}};
//        int brr [][] = {{3, 6},{6, 9},{6, 7}};

        int arr [][] = {{3, -3},{3, -4}};
        int brr [][] = {{3, 6},{6, 9}};
        int crr [][] = new int [arr.length][ brr[0].length];
        for(int i =0 ; i<arr.length ;i++){
            for(int j = 0 ; j<brr[0].length ;j++){
                for (int k = 0; k < arr[0].length; k++) {
                    crr[i][j] += (arr[i][k]*brr[k][j]);
                }
            }
        }
        for (int i = 0; i < crr.length; i++) {
            for (int j = 0; j < crr[0].length ; j++) {
                System.out.print(crr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
