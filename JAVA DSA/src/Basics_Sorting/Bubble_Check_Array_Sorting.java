package Basics_Sorting;

//----> Check the Array is Sorting Or Not !
public class Bubble_Check_Array_Sorting {

    public boolean Check(){
        int [] arr = {1,0,2,3,4,5,6,7,8};
        for(int i =0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return  false;
        }
        return  true;
    }
    static void main(String[] args) {
    Bubble_Check_Array_Sorting obj = new Bubble_Check_Array_Sorting();
        System.out.println(obj.Check());

    }
}
