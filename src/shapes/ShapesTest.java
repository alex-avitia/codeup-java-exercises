package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 4);

        System.out.println("Area: " + box1.getArea(box1.length, box1.width));

        System.out.println("Perimeter: " + box1.getPerimeter(box1.length, box1.width));

        Square box2 = new Square(5);

        System.out.println("Area: " + box2.getArea(box2.side));

        System.out.println("Perimeter: " + box2.getPerimeter(box2.side));
    }
}
