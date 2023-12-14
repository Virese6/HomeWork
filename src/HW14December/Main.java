package HW14December;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Statement[] figures = new Statement[3];

        figures[0] = new Square(2);
        figures[1] = new Rectangle(3, 2);
        figures[2] = new Circle(4);

        for (Statement figure : figures) {
            System.out.println("The name of figure is " +figure.getClass().getSimpleName());
            figure.area();
            System.out.println("------------------------");

        }
    }
}
/* ЗАДАЧА
    Геометрические фигуры.
    Используя свойства наследования написать программу для подсчета площади трех фигур-
    круг, прямоуголник и квадрат.

    Создать классы Circle, Rectangle, Square содержащие соответсвующие методы для подсчета.
    Затем в методе main создать массив из нескольких фигур и вывести на печать площади каждой фигуры и названия ее
    Circle has area of 100.0
    Rectangle has area of 400.0
    Square has area of 340.0
     */
