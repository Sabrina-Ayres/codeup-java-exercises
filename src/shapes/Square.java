package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

//    private final int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getPerimeter() {
//        return 4 * side;
//    }
//
//    public int getArea() {
//        return 2 * side;
//    }

}
