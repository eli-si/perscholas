package org.perscholas.control_flows_and_loops;
// Filename: GreatestCommonDivisor.java

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first positive integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second positive integer: ");
        int n2 = input.nextInt();


        int gcd = findGCD(n1, n2);


        System.out.println("The gcd of " + n1 + " and " + n2 + " is " + gcd);
    }


    public static int findGCD(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}

