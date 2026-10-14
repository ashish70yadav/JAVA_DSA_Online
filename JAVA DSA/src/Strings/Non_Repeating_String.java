package Strings;

public class Non_Repeating_String {
    static void main(String[] args) {
        String s = "ashishyadav";
        int n = s.length();
        int freq [] = new int [26];
        for (int i = 0; i<n ; i++) {
            char ch = s.charAt(i);
            int idx = ch - 97;
            freq[idx]++;
            }

        for (int i = 0; i < s.length(); i++) {
            char ans =s.charAt(i);
            if (freq[ans - 'a']==1){
                System.out.println(ans);
                break;
            }
        }
    }
}
