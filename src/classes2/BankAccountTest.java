package classes2;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(550);
       // System.out.println( bankAccount.getBalance());
        SavingAccount savingAccount = new SavingAccount(600);
        savingAccount.test();
        //savingAccount.withdraw(499);
        //System.out.println(savingAccount.getBalance());

        BankAccount bankAccount1 = new SavingAccount(600);
        bankAccount1.withdraw(550);
        System.out.println(bankAccount1.getBalance());

    }
}
