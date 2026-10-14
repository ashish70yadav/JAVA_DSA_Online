package Strings;

public class SubStringsOfString {
    static void main(String[] args) {
//        String str = "Gopi";
//        System.out.println(str.length())
//        for(int i =0 ;i<=str.length() ; i++){
//            for (int j = i ; j<=str.length() ;j++){
//                System.out.print(str.substring(i,j) + " ");
//            }
//            System.out.println();
//        }
        String str = "2564";
        int sum = 0;
        for(int i =0 ;i<str.length() ; i++){
            for (int j = i ; j<str.length() ;j++){
                sum += Integer.parseInt(str.substring(i,j+1));
            }
        }
        System.out.println(sum);
    }
}
