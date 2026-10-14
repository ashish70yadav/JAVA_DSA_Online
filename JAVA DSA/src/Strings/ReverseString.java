package Strings;

public class ReverseString {
    static void main() {
        String str = "Ashish is a good boy";
        String ans = "";
        int start = 0;
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                for (int j = i - 1; j >= start; j--) {
                    ans += str.charAt(j);
                }
                if (i != str.length())
                    ans += " ";
                start = i + 1;
            }
        }
        System.out.println(ans);
    }
}