package Strings;

import java.util.ArrayList;

public class String_Builder {
    static void main(String[] args){
//     ArrayList<Character> str = new ArrayList<>();
//        str.add('s');
//        str.add(0,'A');
//        System.out.println(str);

    StringBuilder sb = new StringBuilder(5);
        System.out.println(sb.length() +"  "+ sb.capacity());
        sb.append("Ashish");
        System.out.println(sb.length() +"  "+ sb.capacity());
        sb.setCharAt(1,'A');
        System.out.println(sb);
    }
}
