package Assignments;

public class Assignment15 {

    public static void main(String[] args) {


        printTriangle(5, '*');
        printTriangle(10, '$');
        printTriangle(25, '%');
    }

    public static void printTriangle(int height, char ch) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {

                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(ch+" ");
            }

            System.out.println();
        }


    }
}