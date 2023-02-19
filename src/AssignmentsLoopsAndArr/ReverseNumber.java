package AssignmentsLoopsAndArr;

public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println(reverse(123456));

    }



   public static int reverse(int num){

        int revNum=0;
        while(num > 0){

            revNum=revNum*10+num%10;

         num=num/10;

       }
        return revNum;
    }



}
