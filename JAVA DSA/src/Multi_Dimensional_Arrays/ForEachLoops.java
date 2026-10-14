package Multi_Dimensional_Arrays;

public class ForEachLoops {
    static void main(String[] args) {
        int [] [] arr ={{2,3,4,6,8},{6,9,8,4,5},{3,4,5,4,6},{3,2,1,5,4}};
//        for (int i = 0 ; i< arr.length ; i++){
//            for (int ele : arr[i]){
//                System.out.print(ele +"  ");
//            }
//            System.out.println();
//        }

        // ------------> OR <-----------

        for(int a [] : arr){
            for (int ele : a){
                System.out.print(ele+"  ");
            }
            System.out.println();
        }
    }
}
