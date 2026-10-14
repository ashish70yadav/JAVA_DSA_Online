package Strings;

import java.util.Scanner;

public class IntToString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer Number ");
        int n = sc.nextInt();
//        String str = "";   // Empty String.
//        str += n;
//        System.out.println(str);

        String s = Integer.toString(n);
        System.out.println(s);
    }
}
