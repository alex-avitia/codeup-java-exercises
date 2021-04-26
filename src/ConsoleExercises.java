import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

        double pi = 3.14159;
        Scanner scan = new Scanner(System.in);

        System.out.printf("The value of pi is approximately %.2f\n", pi);

        System.out.println("Enter an int value: ");
        int myInt = scan.nextInt();

        System.out.printf("You entered %d\n", myInt);

        System.out.println("Enter three seperate words, each followed by the enter key: ");
        String firstWord = scan.next();
        String secondWord = scan.next();
        String thirdWord = scan.next();

        System.out.printf("You entered %s %s %s.\n", firstWord, secondWord, thirdWord);

        String newSentence = scan.nextLine();
        System.out.println("Enter a sentence: ");

        System.out.printf("You entered: \"%s\"", newSentence);

        System.out.println("Enter the length and width of the Codeup Classroom.");
        System.out.print("Length: \n");
        String crLengthString = scan.next();
        System.out.print("Width: \n");
        String crWidthString = scan.next();

        int crLength = Integer.parseInt(crLengthString);
        int crWidth = Integer.parseInt(crWidthString);

        System.out.printf("Area: %d\n", crLength * crWidth);
        System.out.printf("Perimeter: %d\n", crLength * 2 + crWidth * 2);

    }
}
