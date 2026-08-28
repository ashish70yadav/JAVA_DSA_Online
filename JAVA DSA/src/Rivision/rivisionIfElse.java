package Rivision;

import java.util.Scanner;
public class rivisionIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Given the length and breadth of a   rectangle,
        // write a program to find Whether the area of the rectangle is greater than its perimeter.
//         System.out.print("Enter the length : ");
//        int l = sc.nextInt();
//        System.out.print("Enter the Breadth : ");
//        int b = sc.nextInt();
//        int area = l*b;
//        int parameter = 2*(l+b);
//        if(area>parameter){
//            System.out.print("Area is Greater the its parameter is : ");
//            System.out.println(area-parameter);
//        }
//        else if (parameter>area){
//            System.out.print("Parameter is Greater then area is : ");
//            System.out.println(parameter-area);
//        }
//        else{
//            System.out.println("Area and parameter is Equal :");
//        }

        // Write a program to input length and breadth and show it is a Square or not !
       /* System.out.print("Enter length : ");
        int l = sc.nextInt();
        System.out.println("Enter Breadth : ");
        int b = sc.nextInt();
        if (l ==b){
            System.out.println("It is a Square ");
        }
        else {
            System.out.println("It is not Square ");
        } */

        //----> GIven the  coordinates (x,y) of a center of a circle and its radius .
        // Write a program which will determine a point lies insides the circle, on the circle or outside the circle.
        System.out.print("Enter the value of X coordinates :");
        double x = sc.nextDouble();
        System.out.print("Enter the value of Y coordinates :");
        double y = sc.nextDouble();
        System.out.print("Enter the Radius of a circle :");
        double r = sc.nextDouble();
        System.out.print("Enter the value on any point X1 :");
        double X1 = sc.nextDouble();
        System.out.print("Enter the value of any point Y1 :");
        double Y1 = sc.nextDouble();
        double d = x-X1;
        double d1 = y-Y1;
        double R = (d*d)+(d1*d1);
        if ((r*r)>R){
            System.out.println("Point lies inside the circle");
        }
        else if((r*r)<R){
            System.out.println("Point lies outside the circle ");
        }
        else {
            System.out.println("Point lies on the Circle ");
        }

    }
}

