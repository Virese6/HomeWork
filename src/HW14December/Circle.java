package HW14December;

public class Circle extends Statement {

    public Circle(double a){
        super(a);
    }

    public void area(){
        double circleArea = (Math.PI * (a * a));
        System.out.printf("Area of circle = %.2f%n", circleArea);
    }
}
