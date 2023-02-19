package september28;

public class TimeMills {

    public static void main(String[] args) {

     // 1 day = 86400000
     // 1 hour = 3600000
     // 1 min = 60000
     // sec = 1000

        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);

        long days = timeMillis/86400000;
        timeMillis %= 86400000;


        long hours = timeMillis/3600000;
        timeMillis %= 3600000;


        long min = timeMillis/ 60000;
        timeMillis = timeMillis% 60000;


        long sec = timeMillis / 1000;
        timeMillis = timeMillis % 1000;


        System.out.println("Days:" + days);
        System.out.println("Hours:" + hours);
        System.out.println("Minutes:" + min);
        System.out.println("Seconds:" + sec);


        System.out.println(+days + " days: " + hours+ " hours: " + min + " min "+ sec + " sec " + "passed since Unix" );


    }




}
