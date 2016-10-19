package main.Pro3;

import java.text.SimpleDateFormat;

/**
 * Created by ge62 on 2016-09-19.
 */
public class ATM {
    private String userName;
    private String userIdNumber;
    private String userPhoneNumber;

    SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");


    public ATM() {    }

    User temp = new User(userName, userIdNumber, userPhoneNumber); //ATM기에 카드나 통장 넣어서 사용자와 계좌 데이터 읽어오는것을 객체 생성으로 표현


    public void checkMoney() {
        System.out.printf("귀하의 잔액은 " + temp.getAccount().getMoney() + "입니다");
    }

    public void withdraw(int withdraw_price) {
        temp.getAccount().setWithdraw(withdraw_price);
        temp.getAccount().setWithdrawDate(format.format(System.currentTimeMillis()));
        temp.getAccount().setMoney(temp.getAccount().getMoney() - withdraw_price);
    }

    public void deposit(int deposit_price) {
        temp.getAccount().setDeposit(deposit_price);
        temp.getAccount().setdepositDate(format.format(System.currentTimeMillis()));
        temp.getAccount().setMoney(temp.getAccount().getMoney() + deposit_price);
    }
}
