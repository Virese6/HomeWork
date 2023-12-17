package PizzaService;

public class Hawaii extends Pizza{
    String pineapple;
    String ham;
    String cheese;

    public Hawaii(String dough, String sauce, String pineapple, String ham, String cheese) {
        super(dough, sauce);
        this.pineapple = pineapple;
        this.ham = ham;
        this.cheese = cheese;
    }

    @Override
    public void pizzaOrder() {
        super.pizzaOrder();
    }
    @Override
    public void prepare() {
        super.prepare();
        System.out.println(pineapple + " added.");
        System.out.println("***********************");
        System.out.println(ham + " added.");
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
