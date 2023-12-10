package HWCars;

import java.util.Arrays;

public class Salon {
    String brand;

    public Salon(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public String toString(){
        return brand;
    }

    public static void findCar(String carToFind) {

        Salon car1 = new Salon("Audi");
        Salon car2 = new Salon("BMW");
        Salon car3 = new Salon("Ford");
        Salon car4 = new Salon("Honda");
        Salon car5 = new Salon("Hyundai");
        Salon car6 = new Salon("Kia");
        Salon car7 = new Salon("Mazda");

        Salon[] cars = {car1, car2, car3, car4, car5, car6, car7};

        for (int i = 0; i < cars.length; i++){
            if (carToFind.equals(cars[i].getBrand())){
            System.out.println("This car is in stock.");
            return;
        }
    } System.out.println("The car doesn't found. Please, take the one of these cars: " + Arrays.toString(cars));
    }
}
