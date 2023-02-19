package OOP;

public class Circle {



        // properties -> instance variable

        double radius;// instance variables are initialised automatically
    // to their default values


        // behaviors -> instance methods


        public double getArea() {

            return Math.PI * radius * radius;
        }
        public double getPerimeter(){

            return Math.PI * 2 * radius;
            }

    public void setRadius(double newRadius) {

        radius = newRadius;


    }

        }




