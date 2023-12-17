package PizzaService;

public class Pizza {
    String dough;
    String sauce;

    public Pizza(String dough, String sauce) {
        this.dough = dough;
        this.sauce = sauce;
    }

    public void prepare(){
        System.out.println("We prepare your pizza: " + getClass().getSimpleName());
        System.out.println("***********************");
        System.out.println(dough + " added.");
        System.out.println("***********************");
        System.out.println(sauce + " added.");
        System.out.println("***********************");
    }
    public void bake(){
        System.out.println("We are baking a pizza: " + getClass().getSimpleName());
        System.out.println("***********************");
        System.out.println("Pizza: " + getClass().getSimpleName() + " baked.");
        System.out.println("-----------------------");
    }
    public void pack(){
        System.out.println("We are packing a pizza: " + getClass().getSimpleName());
        System.out.println("************************");
        System.out.println(getClass().getSimpleName() + " packed.");
        System.out.println("------------------------");
    }
    public void pizzaOrder(){
        System.out.println("You ordered a pizza: " + getClass().getSimpleName());
        System.out.println("-------------------------");
    }
}
