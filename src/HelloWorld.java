public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.print("World!");

        /* **************************
        Syntax, Types, and Variables
         ************************** */

        // Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        // Create a String variable named myString and assign a string value to it, then print the variable out to the console.

        String myString = "This string bussin'";
        System.out.println(myString);

        // Change your code to assign a character value to myString. What do you notice?

        // myString = 'c';      //mismatched variable type

        // Change your code to assign the value 3.14159 to myString. What happens?

        // myString = 3.14159;  //mismatched variable type

        // Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

        // long myNumber;
        // System.out.println(myNumber);        //expects declaration

        // Change your code to assign the value 3.14 to myNumber. What do you notice?

        // myNumber = 3.14;        //mismatched variable type, expects 'float'

        // Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

        // myNumber = 123L;

        // Change your code to assign the value 123 to myNumber.

        // myNumber = 123;      //marked as redundant

        // Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

        // long num = 3.14;

        // Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

        // float myNumber = 3.14;       //fixed by converting to 'double' or by throwing the whole variable out

        // Copy and paste the following code blocks one at a time and execute them

        // int x = 5;
        // System.out.println(x++);     //prints '5'
        // System.out.println(x);       //prints '6'

        // int x = 5;
        // System.out.println(++x);     //prints '6'
        //System.out.println(x);        //prints '6'

        // What is the difference between the above code blocks? Explain why the code outputs what it does.

        // Try to create a variable named class. What happens?

        // int class = 0;       //'class' is highlighted as a special phrase

        // Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

        // Hypothesis: should be fine

        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;         //converting from String to Object is redundant at best

        // Copy and paste the code above and then run it. Does the result match with your expectation?

        // Conclusion: never mind; redundant, inefficient, UGLY

        // How is the above example different from the code block below?

        // An object can be assigned anything, whereas the bottom example is trying to convert int to string

        // int three = (int) "three";

        // What are the two different types of errors we are observing?

        // One is redundant declarations, the other is illegal casting

        // Rewrite the following expressions using the relevant shorthand assignment operators:

        // int x = 4;
        // x = x + 5;

        int x = 4;
        x += 5;

        // int x = 3;
        // int y = 4;
        // y = y * x;

        x = 3;
        int y = 4 * x;

        // int x = 10;
        // int y = 2;
        // x = x / y;
        // y = y - x;

        x = 10 / 2;
        y = 2 - x;


        // What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

        // things break

        // Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
    }
}