package October5;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");

        int num = scanner.nextInt();

        int square = num * num;

        System.out.println("The square of " + num + " is " + square);


    }

}
