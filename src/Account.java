
/**
 * The Account class sets the account's balance and the account number for the client to be attached for a specific client forward
 *
 * @author Loay Fayez Abdel Raoof
 * @version 1.8
 * data:25/4
 */


public class Account {
    private double balance;
    private int accountNumber;

    /**
     * this default constructor initialize the parameters with 0 for the balance and empty space to the string
     */
    public Account() {
        this.balance = 0;
        this.accountNumber = 0;
    }

    /**
     * A parametrized constructor to set the account's balance and Account number
     *
     * @param balance       to set the balance of the bank account
     * @param accountNumber to set the account number of the bank account
     */
    public Account(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    /**
     * @return return the account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * sets the account balance
     *
     * @param balance to set the balance of the account
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * sets the account number
     *
     * @param accountNumber to set the balance of the account
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the method ToString return the account balance and it's number in meaningful format of strings that is readable
     */
    @Override
    public String toString() {

        return "Account\n==================================\n" + "balance = " + balance + "\nAccountNumber = " + accountNumber + "\n=========================================\n";
    }

    /**
     * @param money used to aet a withdrawal from the account and track from the account balance and subtract it
     */
    public void withdraw(int money) {
        if (balance - money > 0) {
            balance -= money;
        } else {
            System.out.println("you do not have enough money in your account");
        }

    }

    /**
     * @param money used to add to the deposit money or the whole account
     */
    public void deposit(double money) {
        balance += money;
    }

}
