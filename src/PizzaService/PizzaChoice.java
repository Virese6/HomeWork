package PizzaService;

import java.util.Scanner;

public class PizzaChoice {

    public void mOrder(){
        Margarita margarita = new Margarita("dough", "sauce", "tomato", "cheese");
        margarita.pizzaOrder();
        margarita.prepare();
        margarita.bake();
        margarita.pack();
    }
    public void sOrder(){
        Salami salami = new Salami("dough", "sauce", "salami", "cheese");
        salami.pizzaOrder();
        salami.prepare();
        salami.bake();
        salami.pack();
    }
    public void hOrder(){
        Hawaii hawaii = new Hawaii("dough", "sauce", "pineapple", "ham", "cheese");
        hawaii.pizzaOrder();
        hawaii.prepare();
        hawaii.bake();
        hawaii.pack();
    }
}
