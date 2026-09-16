package Rivision;

import java.util.Scanner;

public class Insertion_Sort_of_Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr  = new int[n];
        System.out.print("Enter the Array Element :-  ");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        
    }
}
