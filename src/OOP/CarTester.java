package OOP;

public class CarTester {

    public static void main(String[] args) {

       Car car= new Car();

       car.year=2022;
       car.color="Yellow";
       car.make = "Ferrari";
       car.model="Enzo";
       car.hasInsurance=true;
       car.isElectric=false;
       car.vin= "euehfeui";
       car.price=800000;

        System.out.println(car.getInfo());


    }
}
