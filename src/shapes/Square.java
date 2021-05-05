package shapes;

public class Square extends Rectangle {

    public double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getArea(double side) {
        return Math.pow(side, 2);
    }

    public double getPerimeter(double side) {
        return side * 4;
    }
}
