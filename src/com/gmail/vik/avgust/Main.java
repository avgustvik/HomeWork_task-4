package com.gmail.vik.avgust;


public class Main {

    public static void main(String[] args) {

        /*
        Создать класс BankAccount который будет иметь два поля 	accountNumber и balance.
        Реализовать в классе методы setBalance() который будет задавать баланс ,
        credit() метод должен начислять средства на счет,
        debit() - снимать средтва со  счета.
        Реализовать условие что если сумма снятия меньше чем остаток на счету -
        вывести сообщение : “Сумма снятия больше чем остаок на счету!” .
        Создать обьект класса и проверить работу программы.
         */


        BankAccount newAccount = new BankAccount();
        newAccount.setBalance(10569.19);
        newAccount.setAccountNumber("ght58yui91gk");

        System.out.println("Account # is " + newAccount.getAccountNumber());

        System.out.println("Start Balance of account # " + newAccount.getAccountNumber() + "is: " + newAccount.getBalance());

        newAccount.credit(1002.23);
        System.out.println("Balance after add sum: " + newAccount.getBalance());

        newAccount.debit(12500);
        System.out.println("Balance after withdraw: " + newAccount.getBalance());


        if (newAccount.getBalance() < newAccount.debit()) {
            System.out.println("Сумма снятия больше чем остаок на счету!");
        } else System.out.println("Разрешить снятие");

    }

}















