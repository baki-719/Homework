package main.Pro3;

import java.util.Random;

/**
 * Created by ge62 on 2016-09-19.
 */
public class Account {
    private String userName;
    private String userIdNumber;
    private String userPhoneNumber;
    private String account_number;
    private String depositDate;
    private String withdrawDate;
    private boolean isDeposit = false;
    private int deposit;
    private int withdraw;
    private int money;

    public Account(String userName, String userIdNumber, String userPhoneNumber) {
        this.userName = userName;
        this.userIdNumber = userIdNumber;
        this.userPhoneNumber = userPhoneNumber;
        make_account();
    }
    //거래내역 프린트
    public void print() {
        if(isDeposit){
            money = money + deposit;
            System.out.println(deposit + "원을 입금하였습니다. 잔액은 " + money + "원 입니다.");
        } else {
            money = money - withdraw;
            System.out.println(withdraw + "원을 출금하였습니다. 잔액은 " + money + "원 입니다.");
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private void make_account() {
        Random random = new Random();
        account_number = String.valueOf(random.nextLong());
    }
    public void setdepositDate(String depositDate) {
        this.depositDate = depositDate;
    }

    public void setWithdrawDate(String withdrawDate) {
        this.withdrawDate = withdrawDate;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }


}
