public class ControlFlowExercises {

    public static void main(String[] args) {

//        Loop Basics

//        While

//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
            i++;
        }

//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536
//        For
//
//        Refactor the previous two exercises to use a for loop instead.
//        int j = 0;
//        do {
//            System.out.println(j);
//            j += 2;
//        } while (j <= 100);

        for (int j = 0; j <= 100; j += 2) {
            System.out.println(j);
        }

//        int k = 100;
//        do {
//            System.out.println(k);
//            k = k - 5;
//        } while (k >= -10);

        for (int k = 100; k >= -10; k -= 5) {
            System.out.println(k);
        }

//        int a = 2;
//        do {
//            System.out.println(a);
//            a = (int) Math.pow(a, 2);
//        } while (a < 1000000);

        for (int a = 2; a < 1000000; a = (int) Math.pow(a, 2)) {
            System.out.println(a);
        }

    }
}
