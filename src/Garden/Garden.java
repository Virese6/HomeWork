package Garden;

public class Garden {
    public static void main(String[] args) {
        Plant pine = new Tree("Pine Tree",0,0);
        Plant tulip = new Flower("Tulip", 0, 0);
        pine.growPlants();
       tulip.growPlants();
    }
}
