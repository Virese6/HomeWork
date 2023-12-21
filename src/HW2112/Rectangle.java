package HW2112;

public class Rectangle implements Shape{
    int a = 2;
    int b = 3;

    double resultAR;
    double resultPR;

    @Override
    public void areaOfShape() {
        resultAR = (a*b);
        System.out.println("The area of " + getClass().getSimpleName() + " = " + resultAR);
    }

    @Override
    public void perimeterOfShape() {
        resultPR = (a+b+a+b);
        System.out.println("The perimeter of " + getClass().getSimpleName() + " = " + resultPR);
    }
}

