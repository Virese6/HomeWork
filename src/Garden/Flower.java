package Garden;

public class Flower extends Plant{

    public Flower(String name, int height, int age){
        super(name, height, age);
    }

    @Override
    public void doSpring() {
        System.out.println("Now is the Spring. The flower grows.");
        height += 35;
        System.out.println("The Spring is gone. The flower is " + height + " centimeters now.");
        System.out.println("---------------------------------");
    }

    @Override
    public void doSummer() {
            System.out.println("Now is the Summer. The flower doesn't grows. It blooms.");
            System.out.println("The Summer is gone. The flower is " + height + " centimeters now.");
            System.out.println("---------------------------------");
    }

    @Override
    public void doAutumn() {
        System.out.println("Now is the Autumn. The flower doesn't grows. It's cut of.");
        height -=35;
        System.out.println("The Autumn is gone. The flower is " + height + " centimeters now.");
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
