package BankApplication;

public abstract class AccountClass implements BaseInterestClass {

    /*protected String name;
    protected String ssn;
    protected String balance;
    protected String accountNumber;
    protected String routingNumber;
    protected double interestRate;

    public AccountClass(String name, String ssn, String balance) {
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
        this.routingNumber = generateRoutingNumber();
        this.interestRate = BaseInterestRate.getBaseInterestRate();
    }
    public String generateAccountNumber(){
        int lastFour = Integer.parseInt(ssn.substring(ssn.length() - 4));
        int random = (int) (Math.random() * 10000000);
        return lastFour + "" + random;

    }
    public String generateRoutingNumber(){
        int random = (int) (Math.random() * 10000000);
        return "00"+ generateRandomString(7);
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit $" + amount + ". New balance: $" + balance );
    }
    public void withdraw(double  amount){

        System.out.println("Withdrew $" + amount +"New Balance : " + balance );

    }

    public String showInfo() {
        return  "NAME:" + name + '\n' +
                "SSN:" + ssn + '\n' +
                "ACCOUNT NUMBER:" + accountNumber + '\n' +
                "ROUTING NUMBER:" + routingNumber + '\n' +
                "BALANCE:" + balance ;
    }
    public static String generateRandomString(int length) {
        String str = "";
        for (int i = 0; i < length; i++) {
            str = str + (int) (Math.random() * 10);
        }
        return str;
    }*/
}

