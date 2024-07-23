package org.perscholas.pizza_class;

// PizzaOrder.java
public class PizzaOrder {
    private Pizza[] pizzas;
    private int numPizzas;

    // Конструктор
    public PizzaOrder() {
        pizzas = new Pizza[3]; // Максимум 3 пиццы
        numPizzas = 0;
    }

    // Метод для добавления пиццы в заказ
    public void addPizza(Pizza pizza) {
        if (numPizzas < 3) {
            pizzas[numPizzas] = pizza;
            numPizzas++;
        } else {
            System.out.println("Cannot add more than 3 pizzas to the order.");
        }
    }

    // Метод для расчета общей стоимости заказа
    public double calcTotal() {
        double total = 0;
        for (int i = 0; i < numPizzas; i++) {
            total += pizzas[i].calcCost();
        }
        return total;
    }
}

