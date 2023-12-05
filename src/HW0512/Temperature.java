package HW0512;

public class Temperature {
    double gradF;

    public Temperature(double gradF){
        this.gradF = gradF;
    }
    public void toFahrenheit(){
        System.out.println("Result  " + (5*((gradF - 32)/9)));
    }
}
