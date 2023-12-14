package HW14December;

public class Square extends Statement{

    public Square(double a){
        super(a);
    }

    public void area(){
        System.out.println("Area of square = " + (a * a));
    }

}
