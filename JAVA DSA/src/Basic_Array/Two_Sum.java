package Basic_Array;

public class Two_Sum {
    static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int target = 17;
        System.out.println( twoSum(arr, target));
    }
    public static boolean twoSum(int brr[], int target){

        for (int i = 0; i < brr.length; i++) {
            for (int j = i + 1; j < brr.length; j++) {
                if (brr[i] + brr[j] == target)
                   return true;

            }
        }
        return false;
    }
}