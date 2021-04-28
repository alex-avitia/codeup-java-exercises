import java.util.Scanner;

public class HighLow {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
//        The specs for the game are:

        int rand = (int) (Math.random() * 100 - 1 + 1) + 1;
        int userInput;
        int guesses = 5;
        do {
            System.out.println("Guess a number between 1-100: ");
            userInput = scan.nextInt();

            if (userInput > rand && guesses != 1) {
                guesses -= 1;
                System.out.println("LOWER. You have " + guesses + " guesses.");
            } else if (userInput < rand && guesses != 1) {
                guesses -= 1;
                System.out.println("HIGHER.  You have " + guesses + " guesses.");
            } else if (guesses == 1) {
                System.out.println("Ran out of guesses! Try again!");
                break;
            } else {
                System.out.println("GOOD GUESS NERD!");
            }
        } while (!(userInput == rand));
    }
}
