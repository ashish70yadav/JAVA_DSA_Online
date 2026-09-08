package Basics_Sorting;

public class Selection_Sort_1 {
    static void main(String[] args) {
        int [] arr =  {1,3,5,8,2,82,35,675,-3,-634,56};
        int n = arr.length;
        for (int ele : arr) System.out.print(ele + "  ");
        System.out.println();
        for(int i= 0; i<n-1; i++){
            int  min =Integer.MAX_VALUE;
            int Mindx = -1; // in this line any number are allow because it is change in below loop
            for(int j =i ; j<n ; j++){
                if(arr[j]<min){
                    min = arr[j];
                    Mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[Mindx];
            arr[Mindx] = temp;
        }
        for (int ele : arr) System.out.print(ele + "  ");
    }
}
