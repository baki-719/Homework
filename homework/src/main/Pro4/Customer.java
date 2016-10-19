package main.Pro4;

import java.util.Random;

/**
 * Created by ge62 on 2016-09-20.
 */
public class Customer {
    private String cutomName;
    private String cutomGender;
    private String cutomAge;
    private String cutomAdress;
    private String cutomTel;
    private String productName;
    private String productNumber;

    private int cutom_index;

    public Customer() {    }

    public Customer(String cutomName, String cutomGender, String cutomAge, String cutomAdress, String cutomTel, String productName, String productNumber) {
        this.cutomName = cutomName;
        this.cutomGender = cutomGender;
        this.cutomAge = cutomAge;
        this.cutomAdress = cutomAdress;
        this.cutomTel = cutomTel;
        this.productName = productName;
        this.productNumber = productNumber;

        Random random = new Random();

        this.cutom_index = random.nextInt()%1000;
    }

}
