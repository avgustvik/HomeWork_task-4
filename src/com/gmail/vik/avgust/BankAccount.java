package com.gmail.vik.avgust;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double ToAdd) {
        setBalance(getBalance() + ToAdd);
    }

    public void debit(double ToWithdraw) {
        setBalance(getBalance() - ToWithdraw);
    }

    private double ToWithdraw() {
        return ToWithdraw();
    }

    public double debit() {
        return 0;
    }
}



