package classCodes;
import java.util.Scanner;

public class FridaySept16 {


    public static void main(String[] args){



//        Get the required input (radius)  from the user.

        // Declare the required variables

//        double radius = 0.4;  //


        System.out.println("This program calculates the area of a circle based on the radius. Please enter the radius: ");

        Scanner input = new Scanner(System.in);  // initializes Scanner object

        //  double radius = 0.4;  // get this value from the user
        double radius = input.nextDouble(); // gets the user input and assigns that to the radius variable.

        double pi = 3.14;






//        Calculate the area using the formula to find the area –>   area = pi * radius * radius;
        // 3.14 * 120.5 * 120.5
        double area = pi * radius * radius;



//        Display the result

        System.out.println("The area of a circle with the radius " + radius + " is: " + area);



    }
}









