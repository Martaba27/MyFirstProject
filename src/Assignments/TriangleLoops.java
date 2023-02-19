package Assignments;

public class TriangleLoops {


    public static void main(String[] args) {

        final int number = 5;
        System.out.println("Triangle 01:");
        for (int row = 1; row <= number; row++) {
            for (int num = 1; num <= row; num++) {
                System.out.print(num + " ");

            }
            System.out.println();

        }
        System.out.println("Triangle 02:");

        for (int row = 1; row <= number; row++) {
            for (int num = 1; num <= number - row + 1; num++) {
                System.out.print(num + " ");

            }
            System.out.println();
        }
        System.out.println("\nTriangle 03:");

        for (int row = 1; row <= number; row++) {
            for (int num2 = 1; num2 < number - row; num2++) {
                System.out.print(" ");
            }
            }
            System.out.println();



    }


}
