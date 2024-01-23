package HW2301Task1;

public class Main {
    public static void main(String[] args) {
        Printable printable = str -> System.out.println("!" + str + "!");
        printable.print("Hello");

        Producible producible = () -> "Hello World";
        System.out.println(producible.produce());
    }
}
/*
Создать следующие интерфейсы:
Printable, содержащий метод void print(String s)
Producible, содержащий метод String produce()
Используя эти интерфейсы написать 2 лямбды, реализующие метод соответствующего интерфейса таким образом:

строка распечатывается в виде !строка!
возвращается строка "Hello World"
 */