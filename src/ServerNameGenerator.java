import java.util.Random;

public class ServerNameGenerator {

//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

//    Create a method that will return a random element from an array of strings.

    public static String returnRandomElement (String[] arr) {
        Random rand = new Random();

        int randomElement = rand.nextInt(arr.length);

        return arr[randomElement];
    }

//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

    public static void main(String[] args) {

        String[] adjectives = {"solid", "ornate", "large", "arduous", "nonsensical", "abrupt", "greedy", "faltering", "oblivious", "liquid"};
        String[] nouns = {"crab", "ocelot", "snake", "taco", "grape", "empress", "bean", "nectar", "whale", "sleep"};
        System.out.print("New Server Name: ");
        System.out.println(returnRandomElement(adjectives) + "-" + returnRandomElement(nouns));

    }

}
