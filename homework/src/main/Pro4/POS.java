package main.Pro4;

/**
 * Created by ge62 on 2016-09-20.
 */
public class POS extends Franchise {

    private int productPrice;
    private int money;
    private double royalty = money * 0.1;

    public POS(String franchiseName, String franchiseTel, String franchiseAdress, String manager, int numberStaff, String[] cutomName, String[] cutom_gender, String[] cutomAge, String[] cutomAdress, String[] cutomTel, String[] productName, String[] productNumber, int productPrice, int[] cutomIndex, int money) {
        super(franchiseName, franchiseTel, franchiseAdress, manager, numberStaff);
    }
}
