package org.perscholas.control_flows_and_loops;
import java.util.Scanner;

public class Case_5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
    int score = scanner.nextInt();

        if (score < 0 || score > 100) {
        System.out.println("Score out of range");
    } else if (score >= 90) {
        System.out.println("A");
    } else if (score >= 80) {
        System.out.println("B");
    } else if (score >= 70) {
        System.out.println("C");
    } else if (score >= 60) {
        System.out.println("D");
    } else {
        System.out.println("F");
    }

        scanner.close();
}
}