package StringBuilderMethod;

public class SBDemo {

    public static void main(String[] args) {

        // String is immutable, original value of the string cannot be changed after initialized

        String str = new String("basketball");

        System.out.println((str.substring(6)));
        System.out.println(str.toUpperCase());
        System.out.println(str);

        // StringBuilder class is a mutable class, calling a method on its object changes the original object

        StringBuilder sb = new StringBuilder();

        sb.append("basket").append("ball").append(2022).append(true).append('X');
        System.out.println(sb);
        sb.delete(6,10);
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);

        sb.deleteCharAt(0).deleteCharAt(1);
        System.out.println(sb);

        sb.deleteCharAt(0).deleteCharAt(sb.length()-1);
        System.out.println(sb);

        String str2 = "Hello world";

        StringBuilder sb2 = new StringBuilder(str2);
        System.out.println(sb2);

        sb2.append(12).deleteCharAt(0).delete(1,3);
        System.out.println(sb2);

        String convertedStr = sb2.toString();
        System.out.println(convertedStr);

        StringBuilder  sb3 = new StringBuilder("chatGPT");
        sb3.insert(4,2022).insert(0,2022);
        System.out.println(sb3);

        sb3.replace(0,4,"twenty");
        System.out.println(sb3);

        sb3.setCharAt(sb3.length()-1,'S');
        System.out.println(sb3);

        System.out.println(sb3.length());

        StringBuilder sb4 = new StringBuilder("talk is cheap. show me the code");
        sb4.reverse();
        System.out.println(sb4);


  int prim = Integer.parseInt("123");
  Integer wrap = Integer.valueOf("123");

        System.out.println(prim);

        System.out.println(wrap);
    }
}
