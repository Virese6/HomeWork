package HW2112;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.areaOfShape();
        circle.perimeterOfShape();
        rectangle.areaOfShape();
        rectangle.perimeterOfShape();
        double a = circle.resultAC;
        double b = rectangle.resultAR;
        squareOfEveryShape(a,b);
    }
    public static double squareOfEveryShape(double a, double b){
        System.out.println("Square " + Circle.class.getSimpleName() + " and " + Rectangle.class.getSimpleName() +
                " = " + (a+b));
        return a+b;
    }
}
