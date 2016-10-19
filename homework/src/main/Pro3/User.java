package main.Pro3;

/**
 * Created by ge62 on 2016-09-19.
 */
public class User {
    private String name;
    private String idNumber;
    private String phoneNumber;
    private Account account = new Account(name, idNumber, phoneNumber);

    public Account getAccount() {
        return account;
    }

    public User(String name, String idNumber, String phoneNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

}
