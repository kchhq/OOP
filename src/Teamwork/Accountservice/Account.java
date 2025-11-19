package Teamwork.Accountservice;

import java.util.Scanner;

public class Account {
    private String accountNumber;//계좌번호
    private String owner; //계좌주
    private int balance; //잔액

    private static Scanner sc = new Scanner(System.in);

    public Account(String accountNumber,  String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setowner(String owner) {
        this.owner = owner;
    }

    //예금 메서드

    public void deposit(int money) {
        this.balance += money;
    }

    //출금 메서드
    public boolean withdraw(int money) {
        if(this.balance<money) {
            return false;
        } else {
            this.balance -= money;
            return true;
        }

    }


}