/**
 * client class represent the information of the client related to his bank account
 *
 * @author Nada Mousa Abdelaziz
 * data:25/4
 */

public class Client {

    private String name;
    private String address;
    private String nationalID, phone;
    private Account account;

    /**
     * this default constructor initialize the parameters with null string
     */
    public Client() {
        this.name = "";
        this.address = "";
        this.nationalID = "";
        this.phone = "";
        this.account = new Account();

    }

    /**
     * @param name       name of the client
     * @param address    address of the client
     * @param nationalID nationalID of the client
     * @param phone      phone number of the client
     * @param account    account of the client
     */
    public Client(String name, String address, String nationalID, String phone, Account account) {

        this.name = name;
        this.address = address;
        this.nationalID = nationalID;
        this.phone = phone;
        this.account = account;
    }

    /**
     * sets the client's name
     *
     * @param name name of the client
     */
    public void setName(String name) {
        this.name = name;
    }
    
     /**
     * sets the client's address
     *
     * @param address address of the client
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * sets the client's national ID
     *
     * @param nationalID nationalID of the client
     */
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }
    
    /**
     * sets the client's phone number
     *
     * @param phone phone number of the client
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    /**
     * sets the client's account
     *
     * @param account account of the client
     */
    public void setAccount(Account account) {
        this.account = account;
    }
    
    /**
     * @return the client's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @return the client's address
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * @return the client's nationalID
     */
    public String getNationalID() {
        return nationalID;
    }
    
    /**
     * @return the client's phone number
     */
    public String getPhone() {
        return phone;
    }
    
    /**
     * @return the client's account
     */
    public Account getAccount() {
        return account;
    }
    
    /**
     * @return the name of the client,address,account,nationalID,and his phone number
     */
    @Override
    public String toString() {
        return "\nClient\n==================================\nName : " + name + "\nAddress: " + address + "\nAccount: " + account.toString() + "\nNationalID: " + nationalID + "\nPhone: " + phone + "\n==================================\n";
    }
    
    public void setCommercialID(String commercialID) {
    }
}



