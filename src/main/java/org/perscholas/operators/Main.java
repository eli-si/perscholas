package org.perscholas.operators;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Just sum
        int a = 1;
        int b = 2;
        int sumInt = a + b;
        System.out.println(sumInt);

        // Just sum of double
        double da = 46.75;
        double db = 75.08;
        double sumDouble = da + db;
        System.out.println(sumDouble);

        // Adding an integer and a double
        int ia = 1;
        double ib = 76.08;
        double sumDoubleInt = ia + ib;
        System.out.println(sumDoubleInt);

        // Dividing two integers
        int bigN = 101;
        int smallN = 21;
        int divisionResult = bigN / smallN;
        System.out.println(divisionResult);

        // Changing the larger number to decimal
        double bigNumDecimal = 100.0;
        double divisionResultDecimal = bigNumDecimal / smallN;
        System.out.println(divisionResultDecimal);

        // Casting
        double doubleO = 10.5;
        double doubleT = 2.5;
        double divDouResult = doubleO / doubleT;
        System.out.println(divDouResult);

        int castedResult = (int) divDouResult;
        System.out.println(castedResult);

        // Using integers x and y
        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.println(q);

        double qWithDouble = (double) y / x;
        System.out.println(qWithDouble);

        // Using constant
        final int MAGIC_NUMBER = 42;
        int calculationResult = MAGIC_NUMBER * 2;
        System.out.println(calculationResult);

        // Cafe
        double priceOfCoffee = 2.50;
        double priceOfCappuccino = 3.75;
        double priceOfGreenTea = 1.95;

        int coffeeOrder = 3;
        int cappuccinoOrder = 4;
        int greenTeaOrder = 2;

        double subtotal = (priceOfCoffee * coffeeOrder) + (priceOfCappuccino * cappuccinoOrder) + (priceOfGreenTea * greenTeaOrder);
        final double SALES_TAX = 0.80;
        double totalSale = subtotal + (subtotal * SALES_TAX);

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total $" + totalSale);








    }
}