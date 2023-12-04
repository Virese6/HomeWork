package HW0412;

public class Rectangle {
    int length;
    int width;
    public Rectangle( int length, int width){
        this.length = length;
        this.width = width;

    }
    public void perimeterOfRectangle(){
        System.out.println( "The perimeter of rectangle is " + (length + width) * 2);
    }
    public void areaOfRectangle(){
        System.out.println("The area of rectangle is " + length * width);
    }
}
