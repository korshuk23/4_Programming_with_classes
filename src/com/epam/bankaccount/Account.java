package com.epam.bankaccount;

public class Account {
    private final int id;
    private static int ID;
    private boolean isBLock;
    private final double balance;

    public Account(double balance) {
        this.id = ++ID;
        this.balance = balance;
        this.isBLock = false;
    }

    public String getStatus() {
        String status = isBLock ? "Blocked" : "Unlocked";
        return String.format("Account %d %s.", id, status);
    }

    public int getId() {
        return id;
    }

    public void block() {
        this.isBLock = true;
    }

    public double getBalance() {
        return balance;
    }
}
