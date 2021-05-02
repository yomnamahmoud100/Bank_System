
import java.util.ArrayList;

/**
 * this class has a relation between class client and class Account we can add a
 * (name,phone ,address) to this bank also add a client and his account to this
 * bank and display all clients information and their accounts
 *
 * @author Yomna Mahmoud Abd El wahab 
 * date:25/4
 */
public class Bank {

    private String name;
    private String address;
    private String phone;
    /**
     * array list of has all the clients of the bank
     *
     */
    public ArrayList<Client> arrClient = new ArrayList<>();
    /**
     * array list has all the accounts of the clients of the bank
     */
    public ArrayList<Account> arrAccount = new ArrayList<>();

    /**
     * default constructor give the parameters initial values with ""
     */
    public Bank() {
        this.name = "";
        this.phone = "";
        this.address = "";
    }

    /**
     * parametrized constructor takes the parameters (name,Address,phone) and
     * assign its values to the private ones in the class
     *
     * @param name of the bank
     * @param Address of the bank
     * @param phone of the bank
     */
    public Bank(String name, String Address, String phone) {
        this.name = name;
        this.address = Address;
        this.phone = phone;
    }

    /**
     * method setName assign value to the private attribute "name" in the class
     *
     * @param name of the bank
     *
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method setAddress assign value to the private attribute "Address" in the
     * class
     *
     * @param Address of the bank
     *
     */
    public void setAddress(String Address) {
        this.address = Address;
    }

    /**
     * method setPhone assign value to the private attribute "Phone" in the
     * class
     *
     * @param phone of the bank
     *
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return String which is the value of the "Name"
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return String which is the value of the "Address"
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @return String String which is the value of the "Phone"
     */
    public String getPhone() {
        return phone;
    }

    /**
     * method (add )it add new client and his account to the client list and the
     * account list
     *
     * @param client which has all the client information
     *
     */
    public void add(Client client) {
        arrClient.add(client);
        arrAccount.add(client.getAccount());
    }

    /**
     * this method displays the clients array with all their details
     */
    public void display() {
        System.out.println(arrClient);
    }

}
