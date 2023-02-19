package StringBuilderMethod;

public class StringBufferMethod {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        // StringBuffer is a legacy class, the main difference is StringBuffer methods are synchronised/thread-safe

        sb.append("123").delete(0,1).insert(0,'2');

        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder(" HTML");

        sb1.append(" is fun");
        System.out.println(sb1);

        sb1.append(sb2);
        System.out.println(sb1);

        sb1.charAt(2);
        System.out.println(sb1.charAt(2));

        sb1.length();
        System.out.println(sb1.length());

        sb1.deleteCharAt(3);
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);

        sb1.replace(1,3,"Computer");
        System.out.println(sb1);

        sb1.substring(1,3);
        System.out.println(sb1.substring(1,3));
    }
}
