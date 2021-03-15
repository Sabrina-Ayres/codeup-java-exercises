package shapes;

public class Square extends Rectangle {

    private final int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getPerimeter() {
        return 4 * side;
    }

    public int getArea() {
        return 2 * side;
    }

}
