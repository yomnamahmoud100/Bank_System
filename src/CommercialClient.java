/**
 * commercial client class represent the information of the commercial client related to his bank account
 * 
 * @author  Nada Mousa Abdelaziz
 */


public class CommercialClient extends Client {

    private String commercialID;

    /**
     * this default constructor initialises name,phone,address,nationalID with an empty string and account with null
     */
   public CommercialClient() {
        super();
        this.commercialID="";
        this.setName("");
        this.setPhone("");
        this.setAddress("");
        this.setNationalID("");
        this.setAccount(null);
    }
    
    /**
     * @param name         name of the commercial client
     * @param address      address of commercial the client
     * @param account      account of the commercial client
     * @param nationalID   nationalID of the client
     * @param phone        phone number of the commercial client
     * @param commercialID commercialID of the commercial client
     */
    public CommercialClient(String name, String address, Account account, String nationalID, String phone, String commercialID) {
        super(name, address, nationalID, phone, account);
        this.commercialID = commercialID;
        nationalID = "00000000000000";
    }
    
    /**
     * @param commercialID commercialID of the commercial client
     */
    @Override
    public void setCommercialID(String commercialID) {
            this.commercialID = commercialID;

    }

    /**
     * @return the name of the commercial client,address,account,nationalID,phone number, and his commercialID
     */
    @Override
    public String toString() {
        return "CommercialClient\n==================================\nName: " + getName() + "\nAddress: " + getAddress() + "\nPhone: " + getPhone() +
                "\ncommercialID: " + commercialID + "\n==================================\n" + "\nAccount: " + getAccount().toString();
    }
    
    /**
     * @return the commercialID of the commercial client
     */
    public String getCommercialID() {
        return commercialID;
    }
}