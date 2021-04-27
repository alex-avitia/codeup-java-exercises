import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        int userInput = getInteger(1, 10);
        getFactorial(userInput);
        diceRollSimulator();
        System.out.println(addition(3, 5));
        System.out.println(subtraction(6, 3));
        System.out.println(multiplication(4, 6));
        System.out.println(division(6, 2));
        System.out.println(modulus(4, 3));

    }

    public static void diceRollSimulator(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter how many sides you want on each die in a pair of dice(between 4-20): ");
        int input = scan.nextInt();

        if (!(input >= 4 && input <= 20)){
            diceRollSimulator();
        }

        System.out.println("\nRoll dice? [Y/N]");
        String choice = scan.next();
        if (choice.equals("Y")){
            int die1 = actualDiceRoll(input);
            int die2 = actualDiceRoll(input);
            System.out.println("Rolling dice with " + input + " sides...");
            System.out.println("You rolled a " + die1 + " and a " + die2);
            if ((die1 + die2) == 2) {
                System.out.println("Snake Eyes!");
            } else {
                System.out.println("Total: " + (die1 + die2));
            }

            System.out.println("Would you like to roll again? [Y/N]");
            choice = scan.next();
            if (choice.equals("Y")){
                diceRollSimulator();
            }
        }
    }

    public static int actualDiceRoll(int sides) {
        return (int) (Math.random() * sides - 1 + 1) + 1;
    }

    public static void getFactorial(int input){
        System.out.print(input + "! = ");

        long factorial = 1;
        for (int i = 1; i < input; i++){
            System.out.print(i + " x ");
            factorial *= i;
        }
        System.out.println(input + "  = " + (factorial * input));

    }

    public static int getInteger(int min, int max){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int input = scan.nextInt();

        if (!(input >= min && input <= max)){
            getInteger(1, 10);
        }
        return input;
    }

    public static int addition(int a, int b){


        return a + b;
    }

    public static int subtraction(int a, int b){

        return a - b;
    }

    public static int multiplication(int a, int b){
        int c = 0;
        for (int i = 1; i <= b; i++) {
            c += addition(a, a);
        }

        return c;
    }

    public static int division(int a, int b){


        return a / b;
    }

    public static int modulus(int a, int b){


        return a % b;
    }

}
