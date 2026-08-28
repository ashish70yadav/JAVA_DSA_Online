package Basic_Array;

public class For_Each_Loop {
    static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};

        // for each loop is only traverse,read,print the array element
        // we not modify the Array Original element
        for (int ele  : arr){
            System.out.print(ele +" ");
        }
    }
}
