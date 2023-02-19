package OOPnovember28;

public class CircleTester {

    public static void main(String[] args) {

        Circle circle1 = new Circle();

        System.out.println(circle1.radius);

        circle1.radius = 3.5;

        System.out.println(circle1.radius);

        System.out.println("The area of circle1 with the radius " + circle1.radius +" is " + circle1.getArea());

      circle1.setRadius(5.5);

        System.out.println("The area of circle1 with the radius " + circle1.radius +" is " + circle1.getArea());

    }

    }


