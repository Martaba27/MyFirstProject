package january30;

public class ExceptionDemo {

    public static void main(String[] args) {

     /*System.out.println("Enter two integers for division: ");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();


     try {
         System.out.println("The division of " + a + " by " + b + " is " + a / b);

     }catch (ArithmeticException e){
         System.out.println("Division by zero is not allowed. The result of division is ignored.");
         System.out.println("Terminating the program...");
        //return;

         System.exit(1);
     }



       // int[] arr = {1,2,4};

       // System.out.println(arr[1] +arr[2]);
      //  System.out.println("100 lines of code...");*/


        try{
            int[] arr = new int [2000000000];   // OutOfMemoryError
        }catch(OutOfMemoryError e){
           System.out.println("No memory" );
        }
    }

}
