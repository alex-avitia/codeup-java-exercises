package util;
import java.util.Scanner;

public class Input {

    private static Scanner scan;

//        String getString()

        public static String getString(){
            System.out.println("Enter a string: ");
            scan = new Scanner(System.in);
            return scan.next();
        }

//        boolean yesNo()

        public static boolean yesNo() {
            System.out.println("Continue? [Yes/No]");
            String input = getString();
            return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
        }

//        int getInt(int min, int max)

        public static int getInt(int min, int max) {
            scan = new Scanner(System.in);

            System.out.println("Enter an integer between " + min + " and " + max + ": ");
            int input = scan.nextInt();

            while (input < min || input > max) {
                System.out.println("Alright bud, very funny. Try again: ");
                input = scan.nextInt();
            }
            return input;
        }
//        int getInt()

        public static int getInt(){
            scan = new Scanner(System.in);
            System.out.println("Enter an integer, I don't care which one this time: ");
            return scan.nextInt();
        }
//        double getDouble(double min, double max)

        public double getDouble(double min, double max) {
            scan = new Scanner(System.in);

            System.out.println("Enter a double between " + min + " and " + max + ": ");
            double input = scan.nextDouble();

            while (input < min || input > max) {
                System.out.println("Alright bud, very funny. Try again: ");
                input = scan.nextDouble();
            }
            return input;
        }

//        double getDouble()

        public double getDouble() {
            scan = new Scanner(System.in);
            System.out.println("Enter a double, I don't care which one this time: ");
            return scan.nextDouble();
        }
}