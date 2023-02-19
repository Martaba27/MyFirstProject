package january18;

public class Bird extends Animal {

    void eat() {

        System.out.println("Eat worms");

    }

    void move() {

        System.out.println("Fly");
    }

    public static void main(String[] args) {


        Animal animal = new Bird();

        animal.eat();
        animal.move();

        Number number = Integer.valueOf("35");

        int i = 276067423;

        System.out.println(Integer.reverse(i));

    }

}
