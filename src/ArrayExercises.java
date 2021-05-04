import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {

//        What happens when you run the following code? Why is Arrays.toString necessary?

        // There's an implicit call to toString() to convert the array of ints into a string

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Alex");
        people[1] = new Person("Frank");
        people[2] = new Person("Frida");

    }
}
