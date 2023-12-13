package WIP_trucks;

public class PassengerCar extends Car {
    public PassengerCar(String model, String manufacture, int year, String colour, int maxFuel,
                        int currentFuel, String owner) {
        super(model, manufacture, year, colour, maxFuel, currentFuel, owner);
    }

    public void passengerCarFast(){
        System.out.println("Passenger car can drive faster then 17 km/h");
    }
}
