package Methods;

public class Arguments {
//    public static void sum(int a, int b){  // parameters
//        System.out.println(a+b);
//    }
//    public static void main(String[] args) {
//        sum(5, 8); // Arguments
//    }


    public static  int max (int a, int b,int c ) {
        if (a >= b && b >= c) return a;
        else if(b>=a && b>=c) return b;
        else return  c;
    }

    public static void main(String[] args) {
        System.out.println(max(7,5,9));
    }
}
