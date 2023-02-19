package OOP;

public class CircleTester {

    public static void main(String[] args) {


        Circle circle1 = new Circle();// Classname variableName = new className


        System.out.println(circle1.radius);

        circle1.radius = 2.5;

        System.out.println("The area of a circle1 with the radius " + circle1.radius + " is " +
                +circle1.getArea()+ " and the perimeter is "+ circle1.getPerimeter());

       circle1.setRadius(5.5);

        System.out.println(" the area of a circle1 with the radius "+ circle1.radius+" is "+circle1.getArea()+" " +
                "and the perimeter is "+ circle1.getPerimeter());

    }
        }