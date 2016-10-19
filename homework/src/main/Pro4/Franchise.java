package main.Pro4;

/**
 * Created by ge62 on 2016-09-20.
 */
public class Franchise {
    private String franchiseName;
    private String franchiseTel;
    private String franchiseAdress;
    private String manager;
    private int numberStaff;
    private int profitMonth;

    private Object customers;

    public Franchise(String franchiseName, String franchiseTel, String franchiseAdress, String manager, int numberStaff) {
        this.franchiseName = franchiseName;
        this.franchiseTel = franchiseTel;
        this.franchiseAdress = franchiseAdress;
        this.manager = manager;
        this.numberStaff = numberStaff;

        Staff[] staffs = new Staff[numberStaff];
    }
}
