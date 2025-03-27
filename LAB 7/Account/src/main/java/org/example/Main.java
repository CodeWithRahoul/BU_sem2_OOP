package org.example;

public class Main {
    public static void main(String[] args) {

        Member member1 = new Member("Mannan", "mannan@example.com", "0334567890");
        Member member2 = new Member("Rahoul", "rahul@example.com", "031654321");
        Member member3 = new Member("Abbas", "abbas@example.com", "030023455");

        CurrentAccount currentAccount1 = new CurrentAccount(101, member1, "Main Branch", 5000.00, "Personal");
        CurrentAccount currentAccount2 = new CurrentAccount(102, member2, "Main Branch", 20000.00, "Business");

        SavingAccount savingAccount1 = new SavingAccount(201, member3, "Savings Branch", 13000.00, "Regular");

        System.out.println("Current Accounts:");
        currentAccount1.displayInfo();
        currentAccount2.displayInfo();

        System.out.println("Saving Account:");
        savingAccount1.displayInfo();

    }
}