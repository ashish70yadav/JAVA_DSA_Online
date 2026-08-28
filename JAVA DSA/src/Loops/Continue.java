package Loops;

public class Continue {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (i%2==1) continue;  // continue means skip.
            System.out.println(i);
        }
    }
}
