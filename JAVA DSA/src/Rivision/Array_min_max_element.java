package Rivision;

public class Array_min_max_element {
    public static void main(String[] args) {
        int arr[] ={10 ,50,65,789,-665};
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i< arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
    }
}
