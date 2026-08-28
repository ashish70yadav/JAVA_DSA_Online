package Rivision;
//import java.util.Scanner;
//public class patternPrinting {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Number : ");
//        int n = sc.nextInt();
//        for (int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


//import java.util.Scanner;
//public class patternPrinting{
//    public static void main (String[] arga){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int n = sc.nextInt();
//        for (int i=1;i<=n;i++){
//            int a =1;
//            for(int j=1;j<=i;j++){
//                System.out.print(a+" ");
//                a++;
//            }
//            System.out.println();
//        }
//
//    }
//}


import java.util.Scanner;
public class patternPrinting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i;j++){
                if(i%2==1)  System.out.print(j+" ");
                else System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
