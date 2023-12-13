package WIP_trucks;

import java.util.Scanner;

public class Car {
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

    public Car(String model, String manufacture, int year, String colour, int maxFuel, int currentFuel, String owner) {
        this.model = model;
        this.manufacture = manufacture;
        this.year = year;
        this.colour = colour;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
        this.owner = owner;
    }

    public String theOwner() {
        return "The name of owner is: " + owner;
    }

    public void moveCar(){
        if(getCurrentFuel()<0)
            System.out.println("Check fuel.");
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
}
