package WIP_trucks;

import java.util.Scanner;//

public class Truck extends Car {
    private int maxWeight;
    private int currentWeight = 0;

    public Truck (String model,String manufacture, int year, String color,
                  int maxFuel, int currentFuel, String owner){
        super(model, manufacture, year, color, maxFuel, currentFuel, owner);
        this.maxWeight = getMaxWeight();
        this.currentWeight = getCurrentWeight();
    }

        public  int getMaxWeight(){
            return maxWeight;
        }

        public void setMaxWeight(int maxWeight){
            this.maxWeight = maxWeight;
            }

        public int getCurrentWeight(){
            return currentWeight;
        }
        public void setCurrentWeight(int currentWeight){
            this.currentWeight = currentWeight;
            }

    public void load(int weight){
        if(weight>maxWeight){
            System.out.println("Sorry, the maximal weight is " + getMaxWeight() + ".");
        }
        currentWeight = weight;
        System.out.println("Loading " + weight + " tons.");
        if(weight<getMaxWeight()){
            System.out.println("You can upload more. Free weight is " + (getMaxWeight() - weight));
        }
    }

    public void unload(int unloadingWeight){
            if(unloadingWeight>maxWeight || unloadingWeight>currentWeight) {
                System.out.println("Sorry, you can't unload more then maximal weight. " +
                        "Maximal weight is: " + getMaxWeight());
            }
            if(unloadingWeight<0){
                System.out.println("You can't unload less then 0.");
            }
        System.out.println("Unloading " + unloadingWeight + " tons.");
        System.out.println("Current weight is " + (currentWeight - unloadingWeight));
    }

    public void moveCar(){
        if(getCurrentFuel()<0 && getCurrentWeight()<0)
            System.out.println("Check fuel or weight.");
        System.out.println("You can move.");
    }
}
