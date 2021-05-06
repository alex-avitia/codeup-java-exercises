package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }
//    protected double length;
//    protected double width;
//
//    public Rectangle (double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea () {
//        return this.length * this.width;
//    }
//
//    public double getPerimeter () {
//        return (2 * this.length + 2 * this.width);
//    }
}