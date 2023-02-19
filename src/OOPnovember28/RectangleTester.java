package OOPnovember28;

public class RectangleTester {

    public static void main(String[] args) {


        RectangleAssign rectangle = new RectangleAssign();

        rectangle.width = 4;

        rectangle.height = 40;

     //   System.out.println(rectangle.getArea());


        RectangleAssign rectangle2 = new RectangleAssign();

        rectangle2.width = 3.5;
        rectangle2.height = 35.9;

       // System.out.println(rectangle2.getPerimeter());


        System.out.println(rectangle.width);
        System.out.println(rectangle.height);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());


        System.out.println(rectangle2.width);
        System.out.println(rectangle2.height);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());





        }
    }


