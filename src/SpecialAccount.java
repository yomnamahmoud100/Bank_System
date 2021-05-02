/**
 * @author Loay Fayez Abdel Raoof
 * this class is inherited form the class account that make an exception of the account
 *
 */
public class SpecialAccount extends Account {
    public SpecialAccount(double balance_,int accountNumber){
        super(balance_,accountNumber);
    }

    public SpecialAccount() {
    }

    /**
     * this is an override method from the account that make exception to the client to withdraw up to 1000 L.E. if his account has no balance
     * @param money to set the over withdrawal
     */
    @Override
    public void withdraw(int money) {
        if (getBalance()-money>=-1000){
            double negative;
            negative=getBalance()-money;
            setBalance(negative);
        }
        else {
            System.out.println("you do not have enough money in your account");
        }
    }

    /**
     * override method to make text meaningful and into a string
     * @return the method returns a meaningful text of  the special account balance and its number
     */
    @Override
    public String toString() {

        return "Special Account\n==================================\n" + "balance = " + getBalance() + "\nAccountNumber = " + getAccountNumber() + "\n=========================================\n";
    }
}
