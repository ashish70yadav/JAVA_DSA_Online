package Methods;

import java.util.Scanner;

public class Swap {
    public static void swap(int a, int b) {
        int temp =a;
        a=b;
        b=temp;
        System.out.println("After Swapping : "+" a = "+a+ " b = "+ b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of first Number ");
        int a= sc.nextInt();
        System.out.print("Enter the value of Second Number ");
        int b= sc.nextInt();
        System.out.println("Before Swapping : "+" a = "+a+ " b = "+ b);
        swap(a,b);


//         a= a+b;
//         b=a-b;
//         a=a-b;
//        System.out.println("Before Swapping : "+" a = "+a+ " b = "+ b);
    }
}

