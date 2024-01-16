package HW1112;

public class Calculator {
    private double x;
    private double y;
    private double z;

    public Calculator(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ() {
        return z;
    }

    double sum(double x, double y){

        return x+y;
    }
    double sum(double x, double y, double z){
        return x+y+z;
    }
    double diff(double x, double y){
        return x-y;
    }
    double diff(double x, double y, double z){
        return (x-y-z);
    }
}
