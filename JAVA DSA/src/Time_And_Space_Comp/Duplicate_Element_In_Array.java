package Time_And_Space_Comp;

// Given an Array of size n+1 Consisting of integers form 1 to n.
// One of the Element is duplicate in the Array. Find that duplicate Element.

public class Duplicate_Element_In_Array {
    static void main(String[] args) {
        int [] arr = {1, 3,4, 2, 4, 5,};
        int n = arr.length-1;

        // -----> Brute Force Approach <-----

//        for (int i =0 ; i<=n ; i++){
//            for (int j = i+1; j<=n ; j++){
//                if (arr[i]==arr[j]){
//                    System.out.println("Duplicate array is "+arr[i]);
//                    break;
//                }
//            }
//        }
        // Total Number of Operation = 14


        // ------> Marking in Another Array Approach <------

//        boolean [] flag = new boolean[n+1];
//        for (int i = 0 ; i<= n; i++){
//            int ele = arr[i];
//            if (flag[ele] == true){
//                System.out.println("Duplicate array is "+ ele);
//                break;
//            }
//            else  flag[ele]= true;
//
//        }
        //  Total Number of Operation = 5.


        // ---->Most Optimised <-----

        int sum =0;
        for(int ele: arr){
            sum+=ele;
        }
        int sumN= n*(n+1)/2;
        System.out.println("Duplicate array is "+ (sum-sumN));
        //  Total Number of Operation = 6.
    }
}
