package Strings;

public class Interning_New {
    public static boolean equal (String s1 , String s2){
        if(s1.length() != s2.length()) return  false ;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    static void main() {
//        String s1= "Ashish";
//        String s2 = "Ashish";
//        System.out.println(s1==s2);  // true

//        String s1 = new String("Ashish");
//        String s2 = new String("Ashish");
//        System.out.println(s1==s2);  // false


        String s1 = new String("Ashish");
        String s2 = new String("Ashish");
        System.out.println(equal(s1,s2));

        System.out.println(s1.equals(s2));  // it is sam as the method .

    }
}
