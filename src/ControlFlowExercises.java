import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//            i++;
//        }

//        int j = 0;
//        do {
//            System.out.println(j);
//            j += 2;
//        } while (j <= 100);

//        for (int j = 0; j <= 100; j += 2) {
//            System.out.println(j);
//        }

//        int k = 100;
//        do {
//            System.out.println(k);
//            k = k - 5;
//        } while (k >= -10);

//        for (int k = 100; k >= -10; k -= 5) {
//            System.out.println(k);
//        }

//        int a = 2;
//        do {
//            System.out.println(a);
//            a = (int) Math.pow(a, 2);
//        } while (a < 1000000);

//        for (int a = 2; a < 1000000; a = (int) Math.pow(a, 2)) {
//            System.out.println(a);
//        }


        /*
        ********* FizzBuzz *********
                                  */

//        for (int i = 1; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            else {
//                System.out.println(i);
//            }
//        }

        /*
        ******** Table of Powers ********
                                       */

        Scanner scan = new Scanner(System.in);

//        String userAnswer = "Y";
//
//        while(userAnswer.equals("Y")) {
//            System.out.println("What number would you like to go to?");
//            int input = scan.nextInt();
//
//            System.out.println("number | squared | cubed");
//            System.out.println("------------------------");
//
//            for (int i = 1; i <= input; i++) {
//                System.out.println(i + "      | " + (i * i) + "        | " + (i * i * i));
//            }
//            System.out.println("Would you like to keep going? [Y/N]");
//            userAnswer = scan.next();
//        }

        /*
        ********* Number Grades to Letter Grades *********
                                                        */


        System.out.println("Would you like to enter a grade? [Y/N]");
        String input = scan.next();
        while (input.equals("Y")) {
            System.out.println("Enter a numerical grade from 1-100");

            int grade = scan.nextInt();

            if (grade >= 94 && grade <= 100) {
                System.out.println("A+");
            }else if (grade >= 88) {
                System.out.println("A-");
            } else if (grade >= 84) {
                System.out.println("B+");
            } else if (grade >= 80) {
                System.out.println("B-");
            } else if (grade >= 74) {
                System.out.println("C+");
            } else if (grade >= 67) {
                System.out.println("C-");
            } else if (grade >= 66) {
                System.out.println("D+");
            } else if (grade >= 60) {
                System.out.println("D-");
            } else {
                System.out.println("F");
            }
            System.out.println("Would you like to enter a grade? [Y/N]");
            input = scan.next();
        }
    }
}
