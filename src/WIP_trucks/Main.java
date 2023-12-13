package WIP_trucks;

public class Main {//
    public static void main(String[] args) {
        Car car = new Car("Cyber Track", "Tesla", 2023, "Steel",
                100,50,"Elon MUsk" );
        Truck truck = new Truck("TeslaTruck", "Tesla", 2020, "White", 1000,
                500, "Musk Jr.");

        car.setCurrentFuel(23);
        car.moveCar();
        car.fillFuel(20);
        car.stop();
        System.out.println(car.theOwner());

        System.out.println("___________________________");

        truck.setMaxWeight(2000);
        truck.setCurrentWeight(500);
        truck.load(300);
        truck.unload(250);
        truck.moveCar();
        truck.stop();
        truck.fillFuel(20);
        System.out.println(truck.theOwner());


    }
}
