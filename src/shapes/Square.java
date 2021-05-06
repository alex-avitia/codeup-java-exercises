package shapes;

public class Square extends Quadrilateral {

    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }

//    public double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getArea() {
//        return Math.pow(this.side, 2);
//    }
//
//    public double getPerimeter() {
//        return this.side * 4;
//    }
}