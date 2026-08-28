package JavaInput;

import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b, temp;
        System.out.print("Enter the first Number : ");
        a = sc.nextInt();
        System.out.print("Enter the second Number : ");
        b = sc.nextInt();
        System.out.println("after Swapping");
        temp = a;
        a = b;
        b = temp;
        System.out.println("First number : " +a);
        System.out.println("second number : " +b);

    }
}
