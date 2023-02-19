package AssignmentsLoopsAndArr;

public class NestedLoop {

    public static void main(String[] args) throws InterruptedException {

            for(int i = 0; i<24; i++){
            for(int j = 0; j<60; j++){
                for(int k = 0; k<60; k++){
                    System.out.println(i+":"+j+":"+k+":");
                   //  Thread.sleep(1000);
                }
            }
        }
    }
}
