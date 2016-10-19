package main.Pro4;

import java.util.Random;

/**
 * Created by ge62 on 2016-09-20.
 */
public class Staff extends Franchise {
    private String staffName;
    private String staffGender;
    private String staffAge;
    private String staffAddress;
    private String staffTel;
    private String staffAccount;

    private int staffIndex;
    private int pay;

    private boolean[][] timeCard;

    public Staff(String franchiseName, String franchiseTel, String franchiseAddress, String manager, int number_staff, String staffName, String staffGender, String staffAge, String staffAddress, String staffTel, String staffAccount, int staff_index, int pay) {
        super(franchiseName, franchiseTel, franchiseAddress, manager, number_staff);
        this.staffName = staffName;
        this.staffGender = staffGender;
        this.staffAge = staffAge;
        this.staffAddress = staffAddress;
        this.staffTel = staffTel;
        this.staffAccount = staffAccount;
        this.pay = pay;

        Random random = new Random();
        staffIndex = random.nextInt()%100;

    }

}
