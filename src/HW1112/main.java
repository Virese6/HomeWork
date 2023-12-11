package HW1112;

public class main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(2.9,1,3);

        double sum2 = calculator.sum2Numbers(calculator.getX(),calculator.getY());
        double diff2 = calculator.difference2Numbers(calculator.getX(), calculator.getY());
        double sum3 = calculator.sum3Numbers(calculator.getX(), calculator.getY(), calculator.getZ());
        double diff3 = calculator.difference3Numbers(calculator.getX(), calculator.getY(), calculator.getZ());


        System.out.println("Difference of 2 numbers " + calculator.getX() + " and " + calculator.getY() + " = " +
                diff2);

        System.out.println("Sum of 2 numbers " + calculator.getX() + " and " + calculator.getY() + " = " +
                sum2);

        System.out.println("Sum of 3 numbers " + calculator.getX() + " and " + calculator.getY() + " and " +
                calculator.getZ() + " = "  + sum3);

        System.out.println("Difference of 3 numbers " + calculator.getX() + " and " + calculator.getY() + " and " +
                calculator.getZ() + " = "  + diff3);
    }
}
