package Binary_Search;

public class Sorted_Rotate {
    static void main(String[] args) {
//        int[] arr = {4, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
//        int start = 0;
//        int end = arr.length - 1;
//        int target = 9;
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (arr[mid] == target) {
//                System.out.println("9 found at index: " + mid);
//                break;
//            }
//            // Left part is sorted
//            if (arr[start] <= arr[mid]) {
//                if (target >= arr[start] && target < arr[mid])
//                    end = mid - 1;
//                else
//                    start = mid + 1;
//            }
//            // Right part is sorted
//            else {
//                if (target > arr[mid] && target <= arr[end])
//                    start = mid + 1;
//                else
//                    end = mid - 1;
//            }
//        }




        int[] arr = {4, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 9;
        int start = 0;
        int end = arr.length - 1;
        // Find Pivot
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[end])
                start = mid + 1;
            else
                end = mid;
        }
        int pivot = start;
        System.out.println("Pivot index: " + pivot);
        System.out.println("Pivot element: " + arr[pivot]);

        // Decide which part to search
        if (target >= arr[pivot] && target <= arr[arr.length - 1]) {
            start = pivot;
            end = arr.length - 1;
        }
        else {
            start = 0;
            end = pivot - 1;
        }
        // Binary Search
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("9 found at index: " + mid);
                break;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
    }
}
