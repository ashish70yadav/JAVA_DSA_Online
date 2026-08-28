package Basic_Array;

public class Linear_Search {
    static void main(String[] args) {
        int [] arr = {10,52,85,48,35,65,96,789,6,-69,4,65,65};
        int target = 65;
//        boolean flag = false; // False means target is not exists
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==target){
//                flag = true;
//                break;
//            }
//        }
////        if (flag = true) System.out.println("Target is Exists in Array");
        //-----> or
//        if (flag ) System.out.println("Target is Exists in Array");
//        else System.out.println("Target is Missing in Array");
//        System.out.println(flag);


        //---->  OR

        int found =-1;// -1 means target is not exists
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found=i; // any no. except -1 means target element is exists
                break;
            }
        }
        if (found!=-1) System.out.println("Target Element Is Exists in Array at Index : "+found);
        else System.out.println("Target is Missing in Array");
    }
}
