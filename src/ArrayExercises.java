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

        Person[] newPeople;
        newPeople = addPerson(people, new Person("Ezzy"));

        for (Person newPerson : newPeople) {
            System.out.println(newPerson.getName());
        }

    }

    public static Person[] addPerson(Person[] people, Person newPerson){
        int arrLength = people.length;

        Person[] newPeople = Arrays.copyOf(people, arrLength + 1);
        newPeople[arrLength] = new Person(newPerson.getName());

        return newPeople;
    }

}
