package shapes;

public interface Shape {

    static double getPerimeter(double length, double width) {
        return (2 * length) + (2 * width);
    };

    static double getArea(double length, double width) {
       return length * width;
    };

}
