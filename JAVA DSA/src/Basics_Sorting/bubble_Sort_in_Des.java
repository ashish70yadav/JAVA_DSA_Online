package Basics_Sorting;

public class bubble_Sort_in_Des {
    public static  void show(int [] arr){
        for (int ele : arr){
            System.out.print(ele+"  ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int [] brr = {10,-8,-3,12,14,16};
        int n = brr.length;
        System.out.print("Before Sorting : ");
        show(brr);
        
        for(int i =0; i<n-1; i++){
            int swap = 0;
            for (int j  =0 ; j<n-1; j++){
                if( brr[j] < brr[j+1] ){
                    int temp = brr[j];
                    brr[j] = brr[j+1];
                    brr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
        System.out.print("After Sorting : ");
        show(brr);

    }
}
