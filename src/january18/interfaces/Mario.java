package january18.interfaces;

public class Mario implements Controller{


    @Override
    public void up() {

        System.out.println("Goes up the ladder");

    }

    @Override
    public void down() {

        System.out.println("Goes down the ladder");

    }

    @Override
    public void right() {

        System.out.println("Move right");
    }

    @Override
    public void left() {

        System.out.println("Move left");

    }

    @Override
    public void pressA() {

        System.out.println("Run");

    }

    @Override
    public void pressB() {

    }
}
