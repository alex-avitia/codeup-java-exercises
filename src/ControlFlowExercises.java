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

//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }


    }
}
