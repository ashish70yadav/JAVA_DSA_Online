package Basic_Array;

public class Array_Of_Other_Data_Type {
    static void main(String[] args) {
        double arr [] = new double[5];
        System.out.print("Default Value of Double is : ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"  ");
        }

        System.out.println();

        char a [] = new char[5];
        System.out.print("Default Value of Character is : ");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+"  ");
        }

        System.out.println();

        String ar [] = new String[5];
        System.out.print("Default Value of String is : ");
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+"  ");
        }
    }
}
