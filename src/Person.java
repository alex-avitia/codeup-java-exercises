public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    // main
    public static void main(String[] args) {

//        Person alex = new Person("Alex");
//
//        System.out.println("It's ya boy, " + alex.getName());
//
//        alex.setName("Alex");
//
//        alex.sayHello();



//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        // returns true
//        System.out.println(person1.getName().equals(person2.getName()));
//        // returns false
//        System.out.println(person1 == person2);

        // this is because the first print statement compares the strings that are stored in each "Person"
        // the second print statement checks to see if they are the same object, which they are not, despite having the same values assigned to them



//        Person person1 = new Person("John");
//        Person person2 = person1;
//        // returns true
//        System.out.println(person1 == person2);
//
//        // person2 now equals person1, so they are the same object with redundant declarations



        Person person1 = new Person("John");
        Person person2 = person1;
        // both are currently john
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        // I mean... Yeah okay. Now both are Jane. Huh.
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        // because person2 and person1 are now viewed as the same object, changing even one Person's stored value would affect both

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello () {
        System.out.printf("Hello, %s! I love you", this.name);
    }
}
