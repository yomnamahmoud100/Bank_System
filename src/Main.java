import java.util.Scanner;

/**
 * @author loay fayez,nada mousa,yomna mahmoud
 * data:25/4
 */

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String name, address, nationalID, phone;
    static int accountNumber_ = 0;


    public static void clientMenu(Bank bank, int choice_, Client client) {
        if (choice_ == 1) {
            client = new Client();
            System.out.println("Normal client");
        } else if (choice_ == 2) {
            client = new CommercialClient();
            System.out.println("Commercial client");
        } else {
            System.out.println("invalid choice");
        }
        System.out.println("Please enter the name of the client");
        name = scanner.next();
        client.setName(name);
        System.out.println("please enter the address of the client");
        address = scanner.next();
        client.setAddress(address);
        System.out.println("please enter the phone of the client");
        phone = scanner.next();
        client.setPhone(phone);
        if (choice_ == 2) {
            System.out.println("please enter the commercial ID of the client");
            nationalID = scanner.next();
            while (nationalID.length()!=14){
                System.out.println("Invalid data,please enter the commercialID again.");
                nationalID=scanner.next();
                if (nationalID.length()==14){break;}
            }
            client.setCommercialID(nationalID);
        } else {
            System.out.println("please enter the nationalID of the client");
            nationalID = scanner.next();
            client.setNationalID(nationalID);
        }
        System.out.println("Choose the account type:\n1-Normal account\n2-Special account");
        int accountType;
        accountType = scanner.nextInt();
        switch (accountType) {
            case 1:
                accountNumber_++;
                Account account1 = new Account(0, accountNumber_);
                client.setAccount(account1);
                break;
            case 2:
                accountNumber_++;
                Account account2 = new SpecialAccount(0, accountNumber_);
                client.setAccount(account2);
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        bank.add(client);

    }

    public static void main(String[] args) {
        boolean flag = true;
        Client client = new Client();
        Bank bank = new Bank("ali", "12 st.Dokki", "1145");
        while (flag) {
            System.out.println("1-add new client\n2-list all accounts-clients\n3-withdraw-deposit\n4-exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter type of the client\n1-normal client\n2-commercial client\n3-back");
                    int clientType;
                    clientType = scanner.nextInt();
                    if (clientType == 3) {
                        break;
                    }
                    clientMenu(bank, clientType, client);

                    break;
                case 2:
                    if (bank.arrClient.size() == 0 || bank.arrAccount.size() == 0) {
                        System.out.println("Their is no clients or accounts.");
                        flag = false;
                    } else {
                        bank.display();
                    }
                    break;

                case 3:
                    System.out.println("Enter the client name:");
                    String name;
                    boolean found = false;
                    name = scanner.next();
                    for (int i = 0; i < bank.arrClient.size(); i++) {
                        if (bank.arrClient.get(i).getName().equals(name)) {
                            found = true;
                            System.out.println("1-deposit\n2-withdraw");
                            choice = scanner.nextInt();
                            System.out.println("enter the money please");
                            int money;
                            money = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    bank.arrClient.get(i).getAccount().deposit(money);
                                    break;
                                case 2:
                                    bank.arrClient.get(i).getAccount().withdraw(money);
                                    break;
                                default:
                                    System.out.println("invalid choice");
                                    break;
                            }
                            System.out.println(bank.arrClient.get(i).getAccount().toString());
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("We can not found the client");
                    }
                    break;

                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("This is Invalid number");
                    break;

            }
        }
    }
}