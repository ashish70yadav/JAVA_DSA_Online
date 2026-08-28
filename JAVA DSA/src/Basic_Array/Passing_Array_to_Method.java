package Basic_Array;

public class Passing_Array_to_Method {
    static void main(String[] args) {
        int arr [] = {10,20,12,60,110,250,41};
        System.out.println(arr[3]);
        change(arr);
        System.out.println(arr[3]);

    }
    public static void change(int y [] ){
        y[3] =20;
    }
}
