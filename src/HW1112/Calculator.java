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

    double sum2Numbers(double x, double y){
        return x+y;
    }
    double sum3Numbers(double x, double y, double z){
        return x+y+z;
    }
    double difference2Numbers(double x, double y){
        return x-y;
    }
    double difference3Numbers(double x, double y, double z){
        return (x-y-z);
    }
}
