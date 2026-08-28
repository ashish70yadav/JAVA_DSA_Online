package Methods;

public class PassByValueAndReference {
    public static void change(int x ){
        x = 20 ;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int y= 6;
        System.out.println(y);
        change(y);
        System.out.println(y);
    }
}
