package Loops;
import java.util.Scanner;
public class AlternetCharacters {
    public static void main(String[] argss){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Characters : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i + 96) + " ");
            }
            System.out.println();
        }
    }
}
