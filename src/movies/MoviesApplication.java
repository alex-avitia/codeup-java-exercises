package movies;

import util.Input;

import java.util.Locale;

public class MoviesApplication {

    public static void main(String[] args) {

        Input scan = new Input();
        Movie[] movieList = MoviesArray.findAll();
        int userChoice;

        /*
           Give the user a list of options for viewing all the movies or viewing movies by category.
           Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
           If a category is selected, only movies from that category should be displayed.
           Your application should continue to run until the user chooses to exit.
         */

        do {

        System.out.println("\nWhat would you like to do?\n");
        System.out.println("0 - Exit");
        System.out.println("1 - View all movies");
        System.out.println("2 - View movies in the Animated category");
        System.out.println("3 - View movies in the Drama category");
        System.out.println("4 - View movies in the Horror category");
        System.out.println("5 - View movies in the Sci-Fi category\n");
        userChoice = scan.getInt();


            switch (userChoice) {
                case 0:
                    break;
                case 1:
                    for (Movie movie : movieList) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : movieList) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : movieList) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : movieList) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : movieList) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
            }
        } while(userChoice != 0);

    }
}
