package january9;

public class CastingRules {


    public static void main(String[] args) {

        //  Fruit fruit = new Orange();
        //  useFruit(new Orange());
        // implicit casting of subtype to a supertype is happening

        //   Fruit fruit = (Fruit) new Orange();

        // primitive casting
        // down ->
        int i = (int) 67.6;

        // up ->

        double d = (double) 5;
        // object casting
        // implicit upcasting happens when subclass object is assigned to superclass reference

        Fruit fruit = new Orange(); // Fruit fruit = (Fruit) new Orange();
    }

    public static void useFruit(Fruit fruit) {

        Orange orange = (Orange) fruit;  // explicit downcasting is required

        // Create a Fruit array

        Fruit[] fruits = new Fruit[]{new Orange(), new Apple()};

        Orange or = (Orange) fruits[0];


        // The compiler will not allow casts to unrelated types

      //  Orange orange1 = new Orange();
        //   Apple apple1 = (Apple) orange; // Compiler error

        Fruit fruit1 = new Apple();

        if (fruit1 instanceof Apple) {  // instanceof checks is a reference points to the
            // object or the given type

            Apple apple1 = (Apple)fruit1;
            System.out.println("Casting happened");
        }
    }
}