package util;

import java.util.Scanner;

public class Input {

    private final Scanner scan;

    // TODO: modify to work with grocery list app

    public Input(){
        this.scan = new Scanner(System.in);
    }

//        String getString()

        public String getString(){
            return scan.next();
        }

//        boolean yesNo()

        public boolean yesNo() {
            String input = getString();
            return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
        }

//        int getInt(int min, int max)

        public int getInt(int min, int max) {
            int input = scan.nextInt();

            while (input < min || input > max) {
                System.out.println("Alright bud, very funny. Try again: ");
                input = scan.nextInt();
            }
            return input;
        }
//        int getInt()
//        Now refactored for the movies application
        public int getInt(){
//            System.out.print("Enter your choice: ");
            return scan.nextInt();
        }
//        double getDouble(double min, double max)

        public double getDouble(double min, double max) {

//            System.out.println("Enter a double between " + min + " and " + max + ": ");
            double input = scan.nextDouble();

            while (input < min || input > max) {
                System.out.println("Alright bud, very funny. Try again: ");
                input = scan.nextDouble();
            }
            return input;
        }

//        double getDouble()

        public double getDouble() {
//            System.out.println("Enter a double: ");
            return scan.nextDouble();
        }
}
