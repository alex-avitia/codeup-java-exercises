import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        System.out.println("Console IO Lecture");

        // =================================== print() and println()

        // this:
//        System.out.println("Here");
//        System.out.println("There");

        // is equivalent to:
//        System.out.print("Here\n");
//        System.out.print("There\n");

        // to concatenate, just like JS:
        String firstName = "Alex";
        String lastName = "Avitia";
//        System.out.println(firstName + " " + lastName);

        // =================================== printf() / .format()

        // same output as print():
//        System.out.printf("Hello");
//        System.out.printf("There");

        // multiple variables:
        System.out.printf("Hello, %s!\n", firstName);
        System.out.printf("Hello, %s %s!\n", firstName, lastName);

        // numbers:
        int numberOfPets = 2;
        String typeOfPets = "cats";
        System.out.printf("I have %d %s.\n", numberOfPets, typeOfPets);

        // currency:
        float currencyPennies = 1000.001F;
        System.out.printf("My iPhone cost $%.2f\n", currencyPennies);

        // =================================== USER INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name?");
        String userFirstName = sc.next();

        System.out.printf("Nice to meet you, %s", userFirstName);

        System.out.println("How old are you?");

        int age = sc.nextInt();

        System.out.printf("Good to hear you are %d years old.\n", age);

        System.out.println("Favorite quote: ");
        String favoriteQuote = sc.nextLine();

        System.out.printf("Funny, \"%s\" is my favorite quote, too!", favoriteQuote);
    }
}
