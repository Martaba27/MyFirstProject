package OOP;

public class Car {

String color;
String make;
String model;
String vin;
int year;
boolean hasInsurance;
boolean isElectric;
double price;


public void AddToInventory(){


    System.out.println("Adding to inventory ");
}
    public void removeFromInventory(){


        System.out.println("Removing from inventory");


    }

    public String getInfo() {
        return
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", van='" + vin + '\'' +
                ", year=" + year +
                ", hasInsurance=" + hasInsurance +
                ", isElectric=" + isElectric +
                ", price=" + price;

    }


    }

