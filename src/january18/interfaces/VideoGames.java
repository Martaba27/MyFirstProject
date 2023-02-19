package january18.interfaces;

import java.util.List;

public class VideoGames {

    public static void main(String[] args) {


        List<Controller> games = List.of(new Mario(),new Contra(), new Tank());

        for(Controller game : games){

        game.up();
        game.down();
        game.left();
        game.right();
        game.pressA();
        game.pressB();

        System.out.println("----------------------------------");

        }

    }
}
