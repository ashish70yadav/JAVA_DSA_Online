package Multi_Dimensional_Arrays;

import java.util.Scanner;

public class SumOfArrayElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = {{3,5,6,7},{3,6,7,9},{8,89,8,9},{5,8,9,3}};
        int n = arr.length;
        int m = arr[1].length;

//        System.out.println("Enter the Number of Row: ");
//        int n = sc.nextInt();
//        System.out.println("Enter the Number of Column: ");
//        int m = sc.nextInt();
//        int [][] arr = new int [n] [m];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter the " +(i+1)+" Row Element");
//            for (int j = 0; j < m; j++) {
//                arr[i][j]= sc.nextInt();
//            }
//        }

//        int sum =0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                sum+=arr[i][j];
//            }
//        }
//        System.out.println("Sum Of The Array Element is: "+sum);


        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(max <= arr[i][j] ){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum Element is : "+max);
    }
}
