package Methods;

public class ReturnIsMandatory {
    public static void main(String[] args) {
        System.out.println(arya(5));
    }
    public static int arya(int a){
        if (a>6) return a; // in the method and return type when we use if statement then also use else statement
        else return 5; // that means else statement is mandatory
    }
}

