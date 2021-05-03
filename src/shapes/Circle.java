package shapes;

import java.util.Scanner;

public class Circle {

    final double pi = Math.PI;

    private static double radius() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public Circle(double radius) {
        System.out.printf("A circle with a radius of %f was created.\n", radius);
    }


    public double getArea(double radius) {
        return pi * (Math.pow(radius(), 2));
    }

    public double getCircumference(double radius) {
        return 2 * pi * radius();
    }



}
