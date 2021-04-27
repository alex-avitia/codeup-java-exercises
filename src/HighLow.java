import java.util.Scanner;

public class HighLow {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
//        The specs for the game are:
//
//    TODO Prompts user to guess the number.
//    TODO All user inputs are validated.
//           TODO If user's guess is less than the number, it outputs "HIGHER".
//    TODO If user's guess is more than the number, it outputs "LOWER".
//    TODO If a user guesses the number, the game should declare "GOOD GUESS!"

        int rand = (int) (Math.random() * 100 - 1 + 1) + 1;
        int userInput;
        do {
            System.out.println("Guess a number between 1-100: ");
            userInput = scan.nextInt();

        } while (!(userInput == rand));
    }
}
