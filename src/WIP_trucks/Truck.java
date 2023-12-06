package WIP_trucks;

import java.util.Scanner;

public class Truck {
    private String model;
        public String getModel(){
        return model;
        }
            public void setModel(String model){
            this.model = model;
            }

    private String manufacture;
        public String getManufacture(){
            return manufacture;
        }
            public void setManufacture(String manufacture){
            this.manufacture = manufacture;
            }

    private int year;
        public int getYear(){
            return year;
        }
            public void setYear(int year){
            this.year = year;
            }

    private String colour;
        public String getColour(){
            return colour;
        }
            public void setColour(String colour){
            this.colour = colour;
            }

    private int maxWeight;
        public  int getMaxWeight(){
            return maxWeight;
        }
            public void setMaxWeight(int maxWeight){
            this.maxWeight = maxWeight;
            }

    private int currentWeight = 0;
        public int getCurrentWeight(){
            return currentWeight;
        }
            public void setCurrentWeight(int currentWeight){
            this.currentWeight = currentWeight;
            }

    private int maxFuel;
        public int getMaxFuel(){
            return maxFuel;
        }
            public void setMaxFuel(int maxFuel){
            this.maxFuel = maxFuel;
            }

    private int currentFuel = 0;
        public int getCurrentFuel(){
            return currentFuel;
        }
            public void setCurrentFuel(int currentFuel){
            this.currentFuel = currentFuel;
            }

    private String owner;
        public String getOwner(){
            return owner;
        }
            public void setOwner(String owner){
            this.owner = owner;
            }

    public Truck(String model, String manufacture, int year, String colour, int maxWeight, int maxFuel, String owner) {
        this.model = model;
        this.manufacture = manufacture;
        this.year = year;
        this.colour = colour;
        this.maxWeight = maxWeight;// can generate to RMB(Right Mouse Button)
        this.maxFuel = maxFuel;
        this.owner = owner;
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
            //currentWeight -= unloadingWeight <-???
        System.out.println("Unloading " + unloadingWeight + " tons.");
        System.out.println("Current weight is " + (currentWeight - unloadingWeight));
    }

    public void move(){
            if(getCurrentFuel()<0 && getCurrentWeight()<0)
                System.out.println("Check fuel or weight.");
        System.out.println("You can move.");
    }
    public void stop(){
        System.out.println("Do you want to stop? Say false or true.");
        Scanner scanner = new Scanner(System.in);
        boolean stop = scanner.nextBoolean();
        if (stop == true){
            System.out.println("You stopped");
        } else System.out.println("You didn't want to stop");
    }

    public void fillFuel(int currentFuel){
            if (currentFuel<10){
                System.out.println("You need to fill fuel");
            }
        System.out.println("Current fuel is " + currentFuel);
    }

    public String theOwner() {
        return "The name of owner is: " + owner;
    }

    /*private void printRemainCapacity(){//print currentWeight
        System.out.println();
    }

     */

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", maxWeight=" + maxWeight +
                ", maxFuel=" + maxFuel +
                ", owner='" + owner + '\'' +
                '}';
    }

    /* public String toString(){
        return "";
    }

    */
}
