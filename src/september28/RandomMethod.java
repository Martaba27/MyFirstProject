package september28;

public class RandomMethod {

    public static void main(String[] args) {

   double randomNumber =  Math.random();   // 0.0 * 0.99

        System.out.println(randomNumber);

        // random number between 0 and 10;

        int randomint = (int)(Math.random()*10);

        System.out.println(  (int)(Math.random()*100) );  //0-100

// 10-19  // 10-20

        int random2 = 10 + (int)(Math.random()*10);


        System.out.println(random2);
//50-99   //50-100

        int random3 = 50+ (int)(Math.random()*50);

        System.out.println(random3);

        int random4 = 10 + (int) (Math.random()*100);

        System.out.println(random4);
    }
}
