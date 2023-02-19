package javaShortVideos;

import java.util.Scanner;

public class ScannerDemo2 {

    public static void main(String[] args) {

   Scanner input= new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        Double num1 = input.nextDouble();
        Double num2 = input.nextDouble();
        Double num3 = input.nextDouble();

        System.out.println("The everage is: " + (num1 + num2 + num3)/3);



    }



}
