package shapes;

public class Square extends Rectangle {

    public double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getArea() {
        return Math.pow(this.side, 2);
    }

    public double getPerimeter() {
        return this.side * 4;
    }
}