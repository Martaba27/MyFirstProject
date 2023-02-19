package October5;

public class ReverseName {

    public static void main(String[] args) {
      /*  reverseName("John", "Carter");

        String name = reverseNaMe("John", "Carter");
        System.out.println(name);
        System.out.println(reverseNaMe("John", "Carter"));


    }

    public static void reverseName(String firstname, String lastname) {
        System.out.println(lastname + ", " + firstname);


    }

    public static String reverseNaMe(String firstname, String lastname) {

        String full = lastname + ", " + firstname;
        return full;*/



       String str = "Inflation";

  //  for(int i =0; i<str.length(); i++) {
      // System.out.print(str.charAt(i));

        String newStr="";
        for(int i =str.length()-1; i>=0;i--) {
            newStr += str.charAt(i);
        }
            System.out.print(newStr);


    }
    }


