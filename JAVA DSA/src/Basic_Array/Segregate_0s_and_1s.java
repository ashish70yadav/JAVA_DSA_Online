package Basic_Array;

public class Segregate_0s_and_1s {
    static void main(String[] args) {
        int [] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1,0,1,0,0, 1, 0};
          // ------> Two Pass Solution
        int NumOfZeros = 0;
        for(int ele : arr){
            if(ele == 0) NumOfZeros++;
        }
        for(int i =0 ;i<NumOfZeros;i++){
            arr[i] = 0;
        }
        for (int i =NumOfZeros; i<arr.length; i++){
            arr[i] =1;
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
