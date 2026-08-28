package Basic_Array;

// Multiple odd indexed Element by 2 and Add 10 to the Even Indexed Element.

public class Odd_Even_Index {
    static void main(String[] args) {
        int arr [] = {20,10,45,64,89,2,35,4};
        showdata(arr);
    }

    static void showdata(int brr []) {
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+"  ");
        }
        System.out.println();
        for (int i = 0; i < brr.length; i++) {
            if (i%2==1){
                brr[i]*=2;
            }
            else {
                brr[i]+=10;
            }
            System.out.print(brr[i]+"  ");
        }
    }
}
