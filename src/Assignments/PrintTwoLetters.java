package Assignments;

public class PrintTwoLetters {

    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {
            for (char j = 'a'; j <= 'z'; j++) {

                System.out.println(i + " " + j);
            }
            System.out.println("-----------");
        }
    }
}