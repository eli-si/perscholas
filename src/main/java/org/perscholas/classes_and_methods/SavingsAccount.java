package org.perscholas.classes_and_methods;

// SavingsAccount.java

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double initialBalance) {
        this.savingsBalance = initialBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate / 100; // Convert percentage to decimal
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(3);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Saver1 balance, 1 month, 3%% : $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2 balance, 1 month, 3%% : $%.2f%n", saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(4);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Saver1 balance, 1 month, 4%%: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2 balance, 1 month, 4%%: $%.2f%n", saver2.getSavingsBalance());
    }
}

