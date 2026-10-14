package Multi_Dimensional_Arrays;

import java.util.Scanner;

public class OutputIn2DArrays {
    static void main(String[] args) {
//        int [][] arr = new int [3] [4];
//        int [][] arr = {{3,5,6,7},{3,6,7,9},{8,89,8,9},{5,8,9,3}};
//        System.out.println("Number of Row present in Array : " +arr.length);  // print only Row
//        System.out.println("Number of column present in Array : " +arr[0].length);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] +"  ");
//            }
//            System.out.println();
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Row: ");
        int n = sc.nextInt();
        System.out.println("Enter the Number of Column: ");
        int m = sc.nextInt();
        int [][] arr = new int [n] [m];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " +(i+1)+" Row Element");
            for (int j = 0; j < m; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Your Array Element is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] +"  ");
            }
            System.out.println();
        }
    }
}
