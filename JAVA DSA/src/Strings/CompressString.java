package Strings;

public class CompressString {
    static void main(String[] args) {
        String str = "aaABbbbCCCCDDDDR";
        String ans = "";
        int count = 1;
        for (int i = 1; i <str.length() ; i++) {
         char current = Character.toLowerCase(str.charAt(i));
         char previous = Character.toLowerCase(str.charAt(i-1));
         if(current==previous){
             count++;
         }
         else{
             ans = ans+previous+count;
             count = 1;
         }
        }
        char last = Character.toLowerCase(str.charAt(str.length()-1));
        ans = ans + last+count;
        System.out.println(ans);
    }
}
