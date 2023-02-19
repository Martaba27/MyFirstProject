package Assignments;

public class reverseString {

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }

    public static String reverse(String str){

      for(int i =str.length()-1; i>=0; i--){

          System.out.print(str.charAt(i));
      }
return "";

    }





}
