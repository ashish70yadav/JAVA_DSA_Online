package Multi_Dimensional_Arrays;

public class RowWithMaxSum {
    static void main(String[] args) {
        int [] [] arr= {{2,3,4,6},{3,6,8,9},{6,8,9,4}};
        int sum = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i< arr.length ; i++){
            int sum1 = 0;
            for (int j = 0; j < arr[0].length; j++) {
                 sum1 += arr[i][j];
                }
            if(sum<sum1){
                sum = sum1;
                idx = i;
        }
            }
        System.out.println("Maximum Sum of Index "+idx + " & sum = "+sum);
    }
}
