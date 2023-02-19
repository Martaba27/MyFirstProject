package OOPnovember28;

public class Car {


    String color;
    String make;
    String model;
    String vin;
    int year;
    boolean hasInsured;
    boolean isElectric;
    double price;

    public void addInventory(){

        System.out.println("Adding to inventory");
    }

    public void removeFromInventory(){

        System.out.println("Removing from inventory");
    }

    public String getInfo(){

        return
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", year=" + year +
                ", hasInsured=" + hasInsured +
                ", isElectric=" + isElectric +
                ", price=" + price ;

    }



    }

