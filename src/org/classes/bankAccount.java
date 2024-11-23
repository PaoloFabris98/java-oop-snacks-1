package org.classes;

import java.util.Random;

public class bankAccount {
    private int accountNumber;
    private Double balance;

    public bankAccount() {
        Random random = new Random();
        this.accountNumber = random.nextInt(1000000);
        this.balance = 0.00;
    }

    public int returnAccountNumber() {
        return this.accountNumber;
    }

    public Double returnBalance() {
        return this.balance;
    }

    public void setBalance(Double num) {
        if (this.balance + num >= 0) {
            this.balance += num;
        } else {
            System.out.println("Non posso compiere l'azione, il conto andrebbe in negativo");
        }
    }

}
