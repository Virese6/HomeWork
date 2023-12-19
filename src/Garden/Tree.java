package Garden;

public class Tree extends Plant{

    public Tree(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public void doSpring() {
        System.out.println("Now is the Spring. The tree grows.");
        height += 50;
        System.out.println("The Spring is gone. The tree is " + height + " centimeters now.");
        System.out.println("---------------------------------");
    }

    @Override
    public void doSummer() {
        System.out.println("Now is the Summer. The tree grows.");
        height += 50;
        System.out.println("The Summer is gone. The tree is " + height + " centimeters now.");
        System.out.println("---------------------------------");
    }

    @Override
    public void doAutumn() {
        System.out.println("Now is the Autumn. The tree doesn't grows.");
        System.out.println("The Autumn is gone. The tree is " + height + " centimeters now.");
        System.out.println("---------------------------------");
    }

    @Override
    public void doWinter() {
        super.doWinter();
    }

    @Override
    public void growPlants() {
        super.growPlants();
    }
}
