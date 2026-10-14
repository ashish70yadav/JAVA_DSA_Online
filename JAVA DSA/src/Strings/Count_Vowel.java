package Strings;

import java.util.Scanner;

public class Count_Vowel {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String or a line or a word:- ");
        String str = sc.nextLine();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }


//            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ||str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' ){
//                count ++;
//            }

        }
        System.out.println("Total Number Of Vowel Present in the Line is : "+count);
    }
}