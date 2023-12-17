package PizzaService;

public class Salami extends Pizza{
    String salami;
    String cheese;

    public Salami(String dough, String sauce, String salami, String cheese) {
        super(dough, sauce);
        this.salami = salami;
        this.cheese = cheese;
    }

    @Override
    public void pizzaOrder() {
        super.pizzaOrder();
    }
    @Override
    public void prepare() {
        super.prepare();
        System.out.println(salami + " added.");
        System.out.println("***********************");
        System.out.println(cheese + " added.");
        System.out.println("***********************");
        System.out.println("Pizza " + getClass().getSimpleName() + "prepared.");
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
