package january13.example;

public class Square extends Shape{

private double side;

    public Square(boolean isFilled, String color, double side) {
        super(isFilled, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side *side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "january13.example.Square{" +
                "side=" + side +
                '}'+super.toString()  ;
    }
}
