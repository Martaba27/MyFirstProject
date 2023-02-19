package Arrays;

public class OverloadedMethodArea {

    public static void main(String[] args) {

        System.out.println("The Area of circle "+getArea(10.0));

        System.out.println("The Area of rectangle "+getArea(15,25));

        System.out.println("The Area of cylinder "+getArea(12.0,17.0));
    }



public static double getArea(double radius){

    return Math.PI*radius*radius;


}
    public static double getArea(int length,int weigth){

     return length* weigth;
    }

    public static double getArea(double radius,double heigth) {

        return Math.PI * radius*radius*heigth;
    }
}
