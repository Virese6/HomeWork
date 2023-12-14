package HW14December;

public class Rectangle extends Statement{

    double b;

    public Rectangle(double a, double b){
        super(a);
        this.b = b;
    }


    public void area(){
        System.out.println("Area of rectangle = " + (a * b));
    }
}
