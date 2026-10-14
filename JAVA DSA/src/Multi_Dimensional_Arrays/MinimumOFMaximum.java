package Multi_Dimensional_Arrays;

public class MinimumOFMaximum {
    static void main(String[] args) {
        int [] [] arr ={{2,3,4,6,8},{6,9,8,4,5},{3,4,5,4,6},{3,2,1,5,4}};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arr[0].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i] [j];
                }
            }
            if(min>max){
                min= max;
            }
        }
        System.out.println("Minimum Of Maximum is : "+min);
    }
}
