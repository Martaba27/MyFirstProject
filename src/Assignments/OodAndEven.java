package Assignments;
import java.util.Scanner;
public class OodAndEven {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();

          System.out.print("In:");
        	int num2 = inp.nextInt();


        //DO NOT CHANGE ABOVE CODE!  Write your code below

        boolean isOod = num % 2 !=0;

        if(isOod==true){
            System.out.println(" is Ood");
        }else{
            System.out.println(" is Even");

        }

        boolean isEven = num % 2 ==0;
        if(isEven==true){
            System.out.println(" is Ood");

        }else {
            System.out.println(" is Even");


        }


        }
         }
