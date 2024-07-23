package org.perscholas.pizza_class;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Создание пицц
        Pizza pizza1 = new Pizza("large", 1, 1, 2);
        Pizza pizza2 = new Pizza("medium", 2, 0, 1);
        Pizza pizza3 = new Pizza("small", 0, 3, 1);

        // Вывод описания пицц
        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
        System.out.println(pizza3.getDescription());

        // Создание заказа и добавление пицц
        PizzaOrder order = new PizzaOrder();
        order.addPizza(pizza1);
        order.addPizza(pizza2);

        // Вывод общей стоимости заказа
        System.out.printf("Total order cost: $%.2f%n", order.calcTotal());
    }
}

