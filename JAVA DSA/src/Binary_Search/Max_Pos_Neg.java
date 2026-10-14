package Binary_Search;

public class Max_Pos_Neg {
    static void main(String[] args) {
        int [] arr= {-25,-15,-12,-3,-1,0,0,0,0,5,6,8,21,36,45,96};
        int lo= 0, hi = arr.length-1, NegCount =0, PosCount=0;
        int n = arr.length;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>=0){
                hi=mid-1;
            }else {
                lo= mid+1;
            }
        }
        NegCount = lo;
        System.out.println(" Negative Count : "+NegCount);
        lo= 0;
        hi = arr.length-1;
        while(lo<=hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] <= 0) {
                lo= mid+1;
            } else {
                hi = mid - 1;
            }
        }
        PosCount = n-lo;
        System.out.println("Positive Count : "+PosCount);
    }
}
