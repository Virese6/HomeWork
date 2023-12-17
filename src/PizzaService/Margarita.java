package PizzaService;

public class Margarita extends Pizza{
    String tomato;
    String cheese;
    public Margarita(String dough, String sauce, String tomato, String cheese) {
        super(dough, sauce);
        this.tomato = tomato;
        this.cheese = cheese;
    }
    @Override
    public void pizzaOrder() {
        super.pizzaOrder();
    }
    @Override
    public void prepare() {
        super.prepare();
        System.out.println(tomato + " added.");
        System.out.println("***********************");
        System.out.println(cheese + " added.");
        System.out.println("***********************");
        System.out.println("Pizza " + getClass().getSimpleName() + " prepared.");
        System.out.println("-----------------------");
    }
    @Override
    public void bake() {
        super.bake();
    }
    @Override
    public void pack() {
        super.pack();
    }
}
