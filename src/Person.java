public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    // main
    public static void main(String[] args) {

        Person alex = new Person("Alex");

        System.out.println("It's ya boy, " + alex.getName());

        alex.setName("Alex");

        alex.sayHello();

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
