package org.perscholas.control_flows_and_loops;


public class PredictFutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 1.07;
        double targetTuition = tuition * 2;
        int years = 0;

        while (tuition < targetTuition) {
            tuition *= rate;
            years++;

        System.out.println("The tuition will be doubled in " + years + " years.");
        System.out.printf("The tuition will be $%.2f after %d years.%n", tuition, years);
    }
}}

