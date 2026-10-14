package Strings;

import java.util.Scanner;

public class Palindrome_String {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int i = 0, j = str.length()-1;
        boolean flag = true;
        while(i<=j) {
            if(str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag== true) System.out.println("This String is a Palindrome ");
        else System.out.println("This String is not a Palindrome ! ");
    }
}
