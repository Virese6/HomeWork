package PizzaService;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class OnlinePizzaShop {
    private PizzaChoice pizzaChoice = new PizzaChoice();

    public void choosePizza() {
        Scanner scanner = new Scanner(System.in);
        String typeOfPizza;
        System.out.println("Hello! This is my PizzaShop. At the moment we have only 3 type of pizza.\n" +
                "You can order: Margarita, Salami oder Hawaii.\n" +
                "If you want to order Margarita, press 1.\n" +
                "If you want to order Salami, press 2.\n" +
                "If you want to order Hawaii, press 3.\n" +
                "If you want to cancel your order, press 4.\n");
        do {
            typeOfPizza = scanner.next();
            switch (typeOfPizza) {
                case ("1"):
                    System.out.println("You chose a Margarita.");
                    pizzaChoice.mOrder();
                    System.out.println("Do you want to order another pizza?");
                    break;
                case ("2"):
                    System.out.println("You chose a Salami.");
                    pizzaChoice.sOrder();
                    System.out.println("Do you want to order another pizza?");
                    break;
                case ("3"):
                    System.out.println("You chose a Hawaii.");
                    pizzaChoice.hOrder();
                    System.out.println("Do you want to order another pizza?");
                    break;
                case ("4"):
                    System.out.println("Thank you for yor order.");
                    break;
                default:
                    System.err.println("To order, press a number from 1 to 3");
            }
        } while (!typeOfPizza.equals("4"));
    }
}

