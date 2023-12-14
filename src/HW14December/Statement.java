package HW14December;

public class Statement {
    double a;

    public Statement(double a){
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void area(){
        System.out.println("Area = " + (a));
    }
}
