package AssignmentsLoopsAndArr;

public class CheckIfVowelIsPresent {

    public static void main(String[] args) {

        System.out.println(isVowelPresent("hello"));
        System.out.println(isVowelPresent("Marta"));
        System.out.println(isVowelPresent("mmmtttt"));

    }

    public static boolean isVowelPresent(String str) {

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'o' || ch == 'a' || ch == 'i' || ch == 'e' || ch == 'u') {

                return true;

            }
        }
         return false;
    }
}
