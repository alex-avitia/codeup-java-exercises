package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Map<String, Student> students = new HashMap<>();

        Student kyle = new Student("Kyle", new int[]{84, 90, 86});
        Student michelle = new Student("Michelle", new int[]{90, 90, 100});
        Student ed = new Student("Eduardo", new int[]{100, 50, 70});
        Student dimitris = new Student("Dimitris", new int[]{100, 50, 70});

        students.put("kyle-loves-monster", kyle);
        students.put("michelle-not-obama", michelle);
        students.put("ed-credible", ed);
        students.put("sir-dimitris", dimitris);



        // TODO: Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.

        //TODO: After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.

        Scanner scan = new Scanner(System.in);
        String choice = "y";

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students: \n");

        while(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
            System.out.println(students.keySet());
            System.out.println("\nWhich student would you like to see more information on?\n");
            String input = scan.next();
            if (!students.containsKey(input)) {
                System.out.println("\nCannot find " + input);
                System.out.println();
                continue;
            } else {
                System.out.print("Name: " + students.get(input).getName() + " - ");
                System.out.println("Github Username: " + input);
                System.out.println("Current Average: " + students.get(input).getGradeAverage());
            }
            System.out.println("\nWould you like to see another student? [Yes/no]");
            choice = scan.next();
        }

        System.out.println("\nGoodbye! Have a wonderful day!");

    }
}
