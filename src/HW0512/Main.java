package HW0512;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit to convert to Celsius ");
        Temperature temperature1 = new Temperature(scanner.nextDouble());
        temperature1.toFahrenheit();

        System.out.println("Enter the temperature in Fahrenheit to convert to Celsius ");
        Temperature temperature2 = new Temperature(scanner.nextDouble());
        temperature2.toFahrenheit();
    }
}
