package january9;

public class Tester {

    public static void main(String[] args) {


        Object[] objects = new Object[]{

                new Apple(),
                new Orange(),
                new String("fsb"),
                //          Integer.valueOf("3"),
                3,
                new String("hello")

        };
        for (Object object : objects) {

            if (object instanceof String) {

                System.out.println(((String) object).toUpperCase());
            }
        }

        Object [] row = {23,"marta.islom", "Martaba", 111222333444L,34.5};

        Long expected = 111222333444L;

        Long actual = (Long)row[3];

    //    if(expected.equals(actual)){

        }
    }
