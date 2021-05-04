package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input scan = new Input();

        System.out.println("Provide a radius for your circle.");

        double radius = scan.getDouble();
        Circle newCircle = new Circle(radius);
        double area = newCircle.getArea(radius);
        double circumference = newCircle.getCircumference(radius);
        System.out.printf("Radius: %f\n", radius);
        System.out.printf("Area: %f\n", area);
        System.out.printf("Circumference: %f\n", circumference);
    }
}
