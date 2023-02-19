package january13.example;

import java.util.List;

public class Tester {

    public static void main(String[] args) {


      //  Shape shape = new Circle(true, "red", 2.3);

        List<Shape>shapeList = List.of(new Circle(true," red ",2.4),
        new Circle(false," yellow ",2.3),
        new Circle(true," black ",2.4),
        new Rectangle(true," yellow ",2,6),
        new Square(false," green ",8));

        for(Shape shape : shapeList){
        System.out.println(shape + " -> Area: " + shape.getArea()+" Perimeter "+ shape.getPerimeter());
    }
    }
}
