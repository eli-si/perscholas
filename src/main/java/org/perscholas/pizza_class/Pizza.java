package org.perscholas.pizza_class;

// Pizza.java
public class Pizza {
    private String size; // "small", "medium", "large"
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    // Конструктор
    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size.toLowerCase(); // Убедимся, что размер в нижнем регистре
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    // Геттеры и сеттеры
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size.toLowerCase();
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    // Метод для расчета стоимости пиццы
    public double calcCost() {
        int basePrice;
        switch (size) {
            case "small":
                basePrice = 10;
                break;
            case "medium":
                basePrice = 12;
                break;
            case "large":
                basePrice = 14;
                break;
            default:
                throw new IllegalArgumentException("Invalid pizza size: " + size);
        }
        return basePrice + 2 * (cheeseToppings + pepperoniToppings + hamToppings);
    }

    // Метод для получения описания пиццы
    public String getDescription() {
        return String.format("Pizza size: %s, Cheese toppings: %d, Pepperoni toppings: %d, Ham toppings: %d, Cost: $%.2f",
                size, cheeseToppings, pepperoniToppings, hamToppings, calcCost());
    }
}

