package Strings;

public class ReverseSb {
    static void main(String[] args) {
        String s = "Ashish";
        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        System.out.println(sb);

//        int i = 0, j = sb.length()-1;
//        while (i<=j){
//            char temp1 = sb.charAt(i);
//            char temp2 = sb.charAt(j);
//            sb.setCharAt(i,temp2);
//            sb.setCharAt(j, temp1);
//            i++;
//            j--;
//        }
//        System.out.println(sb);


//        sb.deleteCharAt(1); // Delete a Specific Code .
//        System.out.println(sb);
//        sb.insert(1,'s');
//        System.out.println(sb);
//        sb.delete(3, 6);
//        System.out.println(sb);

        String s1 = "Anuj";
        StringBuilder str1 = new StringBuilder(s1);
        str1.reverse();
        s1 = str1.toString();
        System.out.println(s1 );



    }
}
