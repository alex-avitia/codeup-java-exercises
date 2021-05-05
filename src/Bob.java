import java.util.Scanner;

public class Bob {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.

        // Note: for some raisin, endsWith wasn't returning the output I wanted, but now it is?


        System.out.println("Say something to Bob: ");
        String input = scan.nextLine();

        if (input.endsWith("?")) {
            System.out.println("Sure.");
        } else if (input.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if (input.length() == 0) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
