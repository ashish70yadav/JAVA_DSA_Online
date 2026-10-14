package Multi_Dimensional_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalsTraingle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList <Integer>> arr = new ArrayList<>();
        System.out.println("Enter the Number Of Rows : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<Integer>());
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i) arr.get(i).add(1);
                else{
                    int val = arr.get(i-1).get(j) + arr.get(i-1).get(j-1);
                    arr.get(i).add(val);
                }
            }
        }
        for (ArrayList<Integer> List : arr){
            for (int ele : List){
                System.out.print(ele +"  ");
            }
            System.out.println();
        }
    }
}
