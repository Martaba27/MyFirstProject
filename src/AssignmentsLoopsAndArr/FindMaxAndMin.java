package AssignmentsLoopsAndArr;

public class FindMaxAndMin {

    public static void main(String[] args) {

        // int [] arr = {34, 10, 11, 95, 58, 96, 38, 66, 92, 35, 59, 16, 70, 7, 58, 2, 37, 7, 95, 96, 68} ;

        //Find Max Value
        // int max = arr[0]; //assume the first one is max

        // for(int i = 1; i< arr.length; i++) {
        //   if (arr[i] > max) {

        //      max = arr[i];
        // }


        // System.out.println("The max is " + max);

        int[] arr = {34, 10, 11, 95, 58, 96, 38, 66, 92, 35, 59, 16, 70, 7, 58, 2, 37, 7, 95, 96, 68};

        int min = arr[0];

        int Index = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
                Index = i;
            }
        }
            System.out.println("The  is " + min+" at index of    " + Index);
    }
}










