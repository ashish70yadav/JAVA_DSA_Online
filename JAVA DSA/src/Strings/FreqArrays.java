package Strings;

public class FreqArrays {
    static void main(String[] args) {
        String str = "ashishyadav";
        int n = str.length();
        int [] freq = new int [26];
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int idx = ch - 97; // because character always start with 97
            freq[idx]++;
        }
        int maxFreq = 0;
        char ans =  str.charAt(0);
        for (int i = 0; i < 26; i++) {
            if(freq[i] > maxFreq){
            maxFreq = freq[i];
            ans = (char)(i+97);
            }
        }
        System.out.println(ans);
    }
}
