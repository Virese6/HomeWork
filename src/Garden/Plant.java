package Garden;

public abstract class Plant {
    String name;
    int height;
    int age;

    public Plant(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public abstract void doSpring();
    public abstract void doSummer();
    public abstract void doAutumn();
    public void doWinter(){
        System.out.println("Now is the Winter. The " + getClass().getSimpleName() + " doesn't grow.");
        System.out.println("The Winter is gone. The " + getClass().getSimpleName() + " is " + height +
                " centimeters now.");
        age++;
        System.out.println("*********************************");
        System.out.println("The season is ended. The " + getClass().getSimpleName() + " is " + height +
                " centimeters now.");
        if(age == 1){
            System.out.println("The " + getClass().getSimpleName() + " is " + age + " year old.");
        } else System.out.println("The " + getClass().getSimpleName() + " is " + age + " years old.");
        System.out.println("*********************************");
    }
    public void growPlants() {
        for (int i = 1; i <= 2; i++) {
            doSpring();
            doSummer();
            doAutumn();
            doWinter();
        }
    }

}
