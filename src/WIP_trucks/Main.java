package WIP_trucks;

public class Main {
    /*создать класс грузовик(Truck), содержащий общие характеристики грузовиков:
    model, manufacturer, year, colour, maxWeight(грузоподъемность), maxFuel(объем бака), owner
    и имеющий следующее подведение: (методы)
     1) должен уметь загружаться(load) и при этом сообщать, если превышена его грузоподъемность и также должен сообщать
     сколько еще можно загрузить груза
     2) должен уметь разгружаться, и при этом сообщать в случае если пытаются разгрузить больше чем загружено
     или пытаются разгрузить отрицательный груз. так же должен сообщать вес остающегося на борту груза
     3) если у него нет груза или бензина, сообщить о невозможности ехать
     4) уметь заправляться топливом
     5) уметь сообщать имя владельца
     6) уметь ездить и останавливаться
     создать несколько грузовиков, протестировать работу, сложить массив и вывести список грузов вместе с их тхх на экран
     */
    public static void main(String[] args) {
        Truck truck1 = new Truck("X10","Volvo",2021,"blue", 5000,800,
                "John");
        /*System.out.println("Information about truck#1: " + truck1);
        System.out.println("Upload begin...");

         */
        truck1.load(300);
        truck1.unload(250);
        truck1.move();
        truck1.stop();
        truck1.fillFuel(20);
        System.out.println(truck1.theOwner());

    }
}
