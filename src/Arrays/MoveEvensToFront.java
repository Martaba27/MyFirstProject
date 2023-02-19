package Arrays;
import java.util.Arrays;
public class MoveEvensToFront {

    public static void main(String[] args) {

      int[] arr1={1,3,8,0,3,6,7};
      moveEvensToFront(arr1);
      System.out.println(Arrays.toString(arr1));


      int[] arr2 ={3,2,0,0,0};
      moveEvensToFront(arr2);
      System.out.println(Arrays.toString(arr2));

    }

    public static void moveEvensToFront(int [] arr){

      for(int i= 0; i< arr.length-1; i++) {
          for (int j = i + 1; j < arr.length; j++) {

              if (arr[j] % 2 == 0) {

                  int temp = arr[j];
                  arr[j] = arr[i];
                  arr[i] = temp;
              }

              //afgfdyegfpu

          }
      }

      }

    }



