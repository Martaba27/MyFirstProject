package Arrays;
import java.util.Arrays;
public class Sorting {

    public static void main(String[] args) {


        int[] arr = {7,4,9,6,11,5,7,89};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] arr2 ={"marta","10","9","00","$"};

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


        String[] arr3={"Marta"};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 =new int [20];
        System.out.println(Arrays.toString(arr4));
        Arrays.fill(arr4,10);
        System.out.println(Arrays.toString(arr4));

        Arrays.fill(arr4,0,3,20);
        System.out.println(Arrays.toString(arr4));

        Arrays.fill(arr4, arr4.length-5, arr4.length,50);
        System.out.println(Arrays.toString(arr4));


        int[] arr5={1,2,3,4,5};
        int [] newArr5 = Arrays.copyOf(arr5,10);

        System.out.println(Arrays.toString(newArr5));

        int[] newArr5Short=Arrays.copyOf(arr5,2);

        System.out.println(Arrays.toString(newArr5Short));
    }
}
