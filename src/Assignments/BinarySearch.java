package Assignments;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.println(binarySearch(arr, 1111));
    }

    public static int binarySearch(int[] arr, int key) {

        int begin = 0;
        int end = arr.length - 1;

        while (end >= begin) {

            int mid = (end + begin) / 2;

            if (key < arr[mid]) {
                end = mid - 1;

            } else if (key == arr[mid]) {

                return mid;
            } else {

                begin = mid + 1;

            }

        }
             return -1;
    }
}