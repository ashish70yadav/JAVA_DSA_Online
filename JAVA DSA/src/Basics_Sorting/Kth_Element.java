package Basics_Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Kth_Element {
    static void main(String[] args) {
        int arr [] = {1,2,12,45,87,63,4,5,9,2,7,6,4};
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of minimum element of the array");
        int  k = sc.nextInt();
        for(int i= n-1; i>=0; i--){
            int  max =Integer.MIN_VALUE;
            int Mindx = -1; // in this line any number are allow because it is change in below loop
            for(int j =0 ; j<=i ; j++){
                if(arr[j]>max){
                    max = arr[j];
                    Mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[Mindx];
            arr[Mindx] = temp;
        }
        for (int i = 0; i <n ; i++) {
            ans.add(arr[i]);
        }
        System.out.println("Array is " + ans);
        System.out.println(ans.get(k-1));
    }
}
