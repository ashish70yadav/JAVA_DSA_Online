package Strings;

public class Compare_to_String_Method {

    public static int Compare(String a, String b) {
        int min = Math.min(a.length(), b.length());
        // First different character find karo
        for (int i = 0; i < min; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }
        // Agar starting characters same hain,
        // to length ke basis par compare karo
        return a.length() - b.length();
    }
    public static void main(String[] args) {
        String str1 = "Ashish";
        String str2 = "Yadav";
        int result = Compare(str1, str2);
        System.out.println(result);
    }
}