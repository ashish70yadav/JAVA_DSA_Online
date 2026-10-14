package Recursion_1;

public class FunctionCallingItSelf {
//    public  static  void print (int n ){
//        if (n==0) return;
//        System.out.println(n);
//        print(n-1);
//    }
//    static void main(String[] args) {
//        print(5);
//    }

    public  static  void print (int n ){
        if (n==0) return; // Base Case
         System.out.print(n+"  ");
        print(n-1);  // self Calling
        if(n!=1) System.out.print(n+"  ");  // Work
    }
    static void main(String[] args) {
        print(5);
    }
}
