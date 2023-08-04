package com.epam.bankaccount;

public class Runner {
    public static void main(String[] args) {
        Bank alphaBank = new Bank("Alpha bank");
        BankClient client1 = new BankClient("Nikolai", "Borisov", "ME2848145");
        BankClient client2 = new BankClient("Sergei", "Apanasevich", "MC1364814");

        alphaBank.addClient(client1, client2);

        client1.openAccount(new Account(103.43));
        client1.openAccount(new Account(500.32));
        client1.openAccount(new Account(13.43));
        client1.openAccount(new Account(3333.43));

        client2.openAccount(new Account(45.5));
        client2.openAccount(new Account(225.33));
        client2.openAccount(new Account(-25.52));
        client2.openAccount(new Account(325.12));

        System.out.println(alphaBank.getClient(client1.getPassportId()).getAccount(1).getStatus());
        client1.blockAccount(1);
        System.out.println(alphaBank.getClient(client1.getPassportId()).getAccount(1).getStatus());

        System.out.println(alphaBank.getClient(client1.getPassportId()).getInformation());
        alphaBank.getClient(client1.getPassportId()).sortByBalance();
        System.out.println(alphaBank.getClient(client1.getPassportId()).getInformation());

        System.out.println("Total balance of client  " +
                alphaBank.getClient(client1.getPassportId()).getFIO() +
                alphaBank.getClient(client1.getPassportId()).getBalance());

        System.out.println("Total balance of client " +
                alphaBank.getClient(client2.getPassportId()).getFIO() +
                alphaBank.getClient(client2.getPassportId()).getBalance());

        System.out.println("Total positive balance " +
                alphaBank.getClient(client1.getPassportId()).getFIO() +
                alphaBank.getClient(client1.getPassportId()).getBalancePositiveAccounts());

        System.out.println("Total negative balance " +
                alphaBank.getClient(client2.getPassportId()).getFIO() +
                alphaBank.getClient(client2.getPassportId()).getBalanceNegativeAccounts());
    }
}
