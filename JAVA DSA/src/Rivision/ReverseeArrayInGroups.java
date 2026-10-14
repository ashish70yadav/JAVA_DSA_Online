package Rivision;

public class ReverseeArrayInGroups {
    static void main(String[] args) {
        int arr [] = {1 ,2 , 3, 4, 5, 6};
        int  k = 3;
        for (int i = 0; i < arr.length; i+=k) {
            int start = i;
            int end = Math.min(arr.length-1 , i+k-1);
            while(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        for(int ele : arr ) System.out.print(ele +"  ");
    }
}
