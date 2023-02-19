package january23;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {

    public static void main(String[] args) {

        String [][] info = {

                {"email", "password", "first", "last"},
                {"gkdgjefkw@gmail.com", "agy746893fgd", "Marta", "Islam"},
                {"gkdgjefkw@gmail.com", "agy746893fgd", "Sabina", "Shodi"},
                {"gkdgjefkw@gmail.com", "agy746893fgd", "Malika", "Ilhom"}
        };

        List<Map<String,String>> listOfMap = new ArrayList<>();

        String [] keys = info[0];

        for(int i = 1; i< info.length;i++) {

            Map<String, String> row = new LinkedHashMap<>();

            for (int j = 0; j < info[i].length; j++) {

                row.put(keys[j], info[i][j]);

            }
            listOfMap.add(row);

        }
        for(Map<String,String > row : listOfMap){

          //  System.out.println(row);

            System.out.println(row.get("email"));
        }
        System.out.println(listOfMap.get(1).get(("first")));


        }

        {

        }
    }

