package Binary_Search;

import java.sql.SQLOutput;

public class Search_Decending_order {
    static void main(String[] args) {
        int  [] arr =  {100,91,87,76,66,52,43,35,29,13, 5};
        int target = 29     ;
        int lo = 0 ,  hi = arr.length;
        boolean flag = false;
        while(lo<=hi){
            int  mid = (lo+hi)/2;
            if (arr [mid] == target){
                flag = true;
                break;
            } else if (arr[mid] > target) lo = mid+1 ;
            else hi = mid -1;
        }
        if (flag == true) System.out.println("Target Element Found ");
        else System.out.println("Target Element Not Found ! ");
    }
}
