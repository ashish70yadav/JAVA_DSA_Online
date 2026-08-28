package Methods;

public class Syntax {
    public static void Ashish(){
        System.out.println("Ashish Yadav ");
    }

    public static void main(String[] args) {
        vikram();
        Ashish();
        System.out.println("Anand Yadav ");
        Ashish();

    }
    public static void vikram () {
        System.out.println("Mahesh");
        pawan();
    }
    public static void pawan () {
        for (int i = 1; i <= 5; i++) {
            if (i==4) continue;
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
