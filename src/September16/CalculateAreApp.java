package September16;

import java.util.Scanner;

public class CalculateAreApp {

    public static void main(String[] args) {

   // Get the required input (radius) from the user.

   //Declare the required variables.

   // Double radius = 0.4 ;

        System.out.println("This program calculates the area of circle based on radius." +
                "Please enter the radious");

        Scanner input = new Scanner(System.in);
        // initializes Scanner object

        /* double radious = 0.4; get this value from the user*/


         double radious = input.nextDouble(); // gets the user input and
        // assigns that to the radious variable.

        double pi = 3.14;


        // Calculate the area using the formula to find
        // the area -> area = pi * radious * radious;
        // 3.14 * 120.5 * 120.5

        double area = pi * radious * radious;

        // Display  the result


        System.out.println(" The area of circle with the radious " +
                + radious+ " is " + area);















    }











}
