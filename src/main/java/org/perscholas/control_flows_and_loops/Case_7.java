package org.perscholas.control_flows_and_loops;

import java.util.Scanner;

public class Case_7 {

    public static double calculateTax(double income, double[] brackets, double[] rates) {
        double tax = 0;
        for (int i = brackets.length - 1; i >= 0; i--) {
            if (income > brackets[i]) {
                tax += (income - brackets[i]) * rates[i];
                income = brackets[i];
            }
        }
        return tax;
    }

    public static double calculateTaxSingle(double income) {
        double[] brackets = {8350, 33950, 82250, 171550, 372950};
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        return calculateTax(income, brackets, rates);
    }

    public static double calculateTaxMarriedJointly(double income) {
        double[] brackets = {16700, 67900, 137050, 208850, 372950};
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        return calculateTax(income, brackets, rates);
    }

    public static double calculateTaxMarriedSeparately(double income) {
        double[] brackets = {8350, 33950, 68525, 104425, 186475};
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        return calculateTax(income, brackets, rates);
    }

    public static double calculateTaxHeadOfHousehold(double income) {
        double[] brackets = {11950, 45500, 117450, 190200, 372950};
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        return calculateTax(income, brackets, rates);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your filing status:");
        System.out.println("1 - Single");
        System.out.println("2 - Married Filing Jointly or Qualifying Widow(er)");
        System.out.println("3 - Married Filing Separately");
        System.out.println("4 - Head of Household");
        int status = scanner.nextInt();

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        double tax = 0;

        switch (status) {
            case 1: // Single
                tax = calculateTaxSingle(income);
                break;
            case 2: // Married Filing Jointly or Qualifying Widow(er)
                tax = calculateTaxMarriedJointly(income);
                break;
            case 3: // Married Filing Separately
                tax = calculateTaxMarriedSeparately(income);
                break;
            case 4: // Head of Household
                tax = calculateTaxHeadOfHousehold(income);
                break;
            default:
                System.out.println("Invalid status");
                System.exit(1);
        }

        System.out.printf("The tax is: $%.2f%n", tax);

        scanner.close();
    }
}
