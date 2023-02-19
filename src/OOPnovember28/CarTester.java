package OOPnovember28;

public class CarTester {

    public static void main(String[] args) {


        Car car = new Car();

        System.out.println(car.getInfo());

       car.year = 2022;
       car.color = "Yellow";
       car.make ="Ferrari";
       car.model = "Enzo";
       car.hasInsured = true;
       car.isElectric = false;
       car.vin = "24FFHd4tuKKG";
       car.price = 1000000;

        System.out.println(car.getInfo());
    }
}
