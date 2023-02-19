package Assignments;

public class AgeGenerating {

    public static void main(String[] args) {


        whatYouCanDo(13);

    }

    public static void  whatYouCanDo(int age){


        if(age<16){
            System.out.println("You can't drive.");

        } else if(age<=17){
            System.out.println("You can drive but not vote.");

        }else if(age<=24){
            System.out.println("You can vote but not rent a car.");

        }else if(age>=25){
            System.out.println("You can do pretty much anything.");


        }


    }

}















