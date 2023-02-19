
package AssignmentsLoopsAndArr;

import java.util.Arrays;

public class MethodsOfArr {

    public static void main(String[] args) {

       String str ="Hello World";
        char [] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));

      //  char temp = arr[0];
      //  arr[0] = arr[arr.length-1];
      //  arr[arr.length-1]=temp;



        System.out.println(Arrays.toString(arr));

        // Create a string from char []

        String reversed =new String(arr);
       System.out.println(reversed);
        System.out.println(String.valueOf(arr));
        System.out.println(arr); //only char arrays will print the content directly as string
        System.out.println(""+new int [] {1,2,3});//it prints memory location not this
        System.out.println(Arrays.toString(new int [] {1,2,3}));//we can like this



    }


}
