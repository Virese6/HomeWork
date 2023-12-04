package HW0412;

public class MainHW {
    public static void main(String[] args) {
        Students student1 = new Students();//t1
        student1.name = "John";
        student1.age = 23;
        Students student2 = new Students();
        student2.name = "Kate";
        student2.age = 25;
        System.out.println("The name and age of first student: " + student1.name + ", " + student1.age + " years old.");
        System.out.println("The name and age of second student: " + student2.name + ", " + student2.age + " years old.");
        //t2

        Rectangle rectangle1 = new Rectangle(12,2);
        rectangle1.perimeterOfRectangle();
        rectangle1.areaOfRectangle();

        Rectangle rectangle2 = new Rectangle(2, 5);
        rectangle2.perimeterOfRectangle();
        rectangle2.areaOfRectangle();


    }
}
