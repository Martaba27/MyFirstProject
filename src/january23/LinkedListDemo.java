package january23;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {


        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Hello");
        linkedList.add("Hi");
        linkedList.add("Hola");
        linkedList.add("Salam");

        linkedList.addFirst("Bonjour");
        linkedList.addLast("guten tag");

        System.out.println(linkedList);
    }
}
