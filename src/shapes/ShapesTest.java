package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Square(4, 4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Rectangle(4, 5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

//        myShape.getLength();
//        myShape.getWidth();

        // Question: Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?

        // I believe this is because Measurable has methods for getPerimeter() and getArea(), and expects anything that implements Measurable is expected to have them.

        // Question: What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?

        // IntelliJ will say that these methods aren't declared in Measurable; they are outside the scope of the interface



//        Rectangle box1 = new Rectangle(5, 4);

//        System.out.println("Area: " + box1.getArea());
//        System.out.println("Perimeter: " + box1.getPerimeter());

//        Rectangle box2 = new Square(5);

//        System.out.println("Area: " + box2.getArea());
//        System.out.println("Perimeter: " + box2.getPerimeter());
    }
}
