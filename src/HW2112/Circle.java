package HW2112;

public class Circle implements Shape{
    int a = 3;
    double resultPC;
    double resultAC;

    @Override
    public void perimeterOfShape() {//Pi(r^2)
        resultPC = (Math.PI*(a*a));
        System.out.println("The perimeter of " + getClass().getSimpleName() + " = " + resultPC);
    }

    @Override
    public void areaOfShape() {//2rPi
        resultAC = (2*a*Math.PI);
        System.out.println("The area of " +getClass().getSimpleName() + " = " + resultAC);
    }
}
