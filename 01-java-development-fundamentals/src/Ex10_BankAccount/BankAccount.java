package Ex10_BankAccount;

public class BankAccount {

    //Class Attributes

    private double balance;
    private double overdraft;
    private double overdraftUsage;

    //Constructors

    public BankAccount(double balance){

        if (balance <= 500 ){
            overdraft = 50;
        }
        else{
            overdraft = balance/2;
        }

        this.balance = balance;

    }

    public double getBalance() {
        return this.balance;
    }




}
