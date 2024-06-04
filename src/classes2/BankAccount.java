package classes2;

public class BankAccount {

    private double balance;

     BankAccount(double balance){
         this.balance = balance;
     }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        balance = balance+depositAmount;
    }

    public void withdraw(double withdrawAmount){
        balance = balance - withdrawAmount;
    }
}
