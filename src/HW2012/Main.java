package HW2012;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week to find out if it is a holiday.");
        String dayOfTheWeek = scanner.next().toLowerCase(Locale.ROOT);
        Week[] day = Week.values();
        boolean isHoliday;
        if ((dayOfTheWeek.equals(day[5].toString().toLowerCase())) ||
        (dayOfTheWeek.equals(day[6].toString().toLowerCase()))){
            isHoliday = true;
            System.out.println(isHoliday);
            return;
        }else {
            isHoliday = false;
            System.out.println(isHoliday);
            return;
        }
    }
}
