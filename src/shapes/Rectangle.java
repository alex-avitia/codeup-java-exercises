package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea (double length, double width) {
        return length * width;
    }

    public double getPerimeter (double length, double width) {
        return (2 * length + 2 * width);
    }
}
