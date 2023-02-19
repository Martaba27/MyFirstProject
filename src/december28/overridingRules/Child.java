package december28.overridingRules;

public class Child  extends Parent {

    public void method2() {


    }

    public void method2(double i) {

    }

    // protected void method3(){ // visibility cannot be reduced

    //void method4() // visibility cannot be reduced


    protected void methods5() {


    }

    public Integer method6() {

        return 8;
    }

    public String method7() {

        return "d";
    }

    // public int method8() { it doesn't work
    //return 8;

    //}


    public void printMessage(int i) {  //overloading method


    }

    public void calculate() {

        System.out.println(100);
    }

    public void calculate(byte i) {

        System.out.println(i);

    }
}