package shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }


//    protected int length;
//
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getPerimeter() {
//       return (2 * length) + (2 * width);
//    }
//
//    public int getArea() {
//       return length * width;
//    }

}
