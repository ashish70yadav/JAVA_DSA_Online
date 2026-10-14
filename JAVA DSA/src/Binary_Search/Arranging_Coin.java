package Binary_Search;

import java.util.Scanner;

public class Arranging_Coin {
        public int arrangeCoins(long n) {
            long lo = 1, hi = n;
            while (lo <= hi) {
                long mid = lo + (hi - lo) / 2;
                long coins = (mid * (mid + 1) )/ 2;
                if (coins == n)
                    return (int) mid;
                else if (coins > n)
                    hi = mid - 1;
                else
                    lo = mid + 1;
            }
            return (int) hi;
        }
        static void main() {
            System.out.println("Enter an Integer Number : ");
            Scanner sc = new Scanner(System.in);
            Arranging_Coin obj = new Arranging_Coin();
            System.out.println(obj.arrangeCoins(sc.nextInt()));
        }
}
