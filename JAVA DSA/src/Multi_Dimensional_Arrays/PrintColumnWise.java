package Multi_Dimensional_Arrays;

public class PrintColumnWise {
    static void main(String[] args) {
        int [] [] arr ={{2,3,4,6,8},{6,9,8,4,5},{3,4,5,4,6},{3,2,1,5,4}};
//        for (int i = 0; i <arr[0].length ; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[j][i]+" ");
//            }
//            System.out.println();
//        }

        //--------------> OR <----------------

        for (int j = 0; j <arr[0].length ; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
