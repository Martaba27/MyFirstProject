package january11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsefulArrayListMethods {

    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>();

        list.add(10);
        list.add(16);
        list.add(75);
        list.add(99);

        System.out.println(list);

        List<Integer>integers = Arrays.asList(1,2,35,67,7,4,00,65);
        integers.set(0,100);

        System.out.println(integers);


        List<Integer>integer1 = List.of(5,6,7,4,99,44);

        List<String>strings = List.of("hi","hello","nice","excellent");

        System.out.println(integer1);
        System.out.println(strings);
    }
}
