package Arrays;
import java.util.Arrays;
public class TwoDimArrays {

    public static void main(String[] args) {

        String[][] names = new String[5][4];

        names[0][0] = "Marta";
        names[3][0] = "Sabina";
        names[4][2] = "Temur";
        System.out.println(Arrays.toString(names));


        //  System.out.println(Arrays.deepToString(names));

        for (String[] each : names) {

            System.out.println(Arrays.toString(each));
        }

        String[][] users = {{"Marta", "Ilhom", "Temur", "Sabina", "Malika"},
                {"Marta", "Ilhom", "Temur", "Sabina", "Malika"},
                {"Marta", "Ilhom", "Temur", "Sabina", "Malika"}};

        System.out.println((Arrays.deepToString(users)));
        System.out.println(users.length);
        System.out.println(users[0].length);


        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users[i].length; j++) {

                System.out.print(users[i][j] + "\t");

            }
            System.out.println();
        }

        int[][] arr = new int[4][];

        System.out.println(Arrays.deepToString(arr));

        arr[0] = new int[2];

        System.out.println(Arrays.deepToString(arr));

        arr[1] = new int[]{1, 2, 3, 4};

        System.out.println(Arrays.deepToString(arr));

        arr[2] = new int[4];

        arr[3] = new int[1];
        System.out.println(Arrays.deepToString(arr));

        arr[1] = new int[]{9, 9, 9, 9, 9, 9, 9};

        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {

            arr[i] = new int[]{8, 8, 8, 8};

            System.out.println(Arrays.deepToString(arr));


            }

        }
    }
