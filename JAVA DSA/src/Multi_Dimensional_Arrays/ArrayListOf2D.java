package Multi_Dimensional_Arrays;

import java.util.ArrayList;

public class ArrayListOf2D {
    static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(35); a.add(63);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2); b.add(4); b.add(6); b.add(8);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(1); c.add(3); c.add(5); c.add(7); c.add(9);
        ArrayList<Integer> d = new ArrayList<>();
        d.add(69); d.add(5); d.add(325);
        ArrayList< ArrayList<Integer> > arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);

//        System.out.println(arr); // Print ArrayList


        //------> Method 2 to Print 2D ArrayList <--------
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.get(i).size(); j++) {
//                System.out.print(arr.get(i).get(j)+"  ");
//            }
//            System.out.println();
//        }


        // -----------> Method 3 to print 2D ArrayList <------------
        for (ArrayList<Integer> List : arr){
            for (int ele : List){
                System.out.print(ele +"  ");
            }
            System.out.println();
        }

    }
}
