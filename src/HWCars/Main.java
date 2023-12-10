package HWCars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a name of car which you want to buy.");
        String carToFind = scanner.next();
        Salon carNew = new Salon(carToFind);
        Salon.findCar(carToFind);
    }
}
