public class ControlStmtsLoopsLec {

    public static void main(String[] args) {

    //Boolean Expressions
    //An expression that evaluates to a boolean value
    //These relational operators will have similarities to our Javascript work - however: no truth-y, or false-y

        System.out.println("(5 == 5) = " + (5 == 5));



    //Logical Operators
    //Combine multiple boolean expressions for evaluation - isAdmin & isLoggedIn, shoppingCart.length > 5 || isDiscountMember
//        boolean isAdmin = true;
//        boolean isLoggedIn = false;
//        boolean isOwner = false;
//        System.out.println("(isAdmin && isLoggedIn) = " + (isAdmin && isLoggedIn) + ". Do I reveal the hidden administrator portal? " + (isAdmin && isLoggedIn));
//        System.out.println("(isOwner || isAdmin) = " + (isOwner || isAdmin) + ". Is this the admin or the user who made this post? Do I 'edit' button for this post? " + (isOwner || isAdmin));
//
//        System.out.println("(!isLoggedIn) = " + (isLoggedIn) + ". Am I not logged in and need to be taken to the log in/registration page? " + (!isLoggedIn));

    //An interesting wrinkle: & vs && and | vs ||
    //Notice: What's up with X between & and &&? One operator still runs the right hand side (RHS) expression no matter what each time, the other will skip that step if the left hand side (LHS) is false

//        int y = 2;
//        int x = 3;
//
//        if (false && (++x == y)) {
//            System.out.println("x = " + x);
//            System.out.println("Equal!");
//        } else {
//            System.out.println("x = " + x);
//            System.out.println("Unequal.");
//        }

    //String Comparison
    //Strings are not primitives! **danger** , str1 == str2 will not help us here!
        String str1 = "Alex";
        String str2 = "Alex";

        System.out.println("(str1 == str2) = " + (str1 == str2));

        System.out.println("str1.equals(str2) = " + str1.equals(str2));

        String cohortLC = "marco";
        String cohortUC = "Marco";

        System.out.println("cohortLC.equalsIgnoreCase(cohortUC) = " + cohortLC.equalsIgnoreCase(cohortUC));

        //~ - ~ * Control Structures * ~ - ~
        //Rely on our foundation in JS here - much of the logic will be similar in our head as to what is going on

        //If. .
//        boolean isAdmin = true;
//        boolean isLoggedIn = true;
//        boolean isOwner = false;
//
//        if(isAdmin && isLoggedIn) {
//            System.out.println("Admin portal accessed");
//        }
//
//        if(isOwner || isAdmin) {
//            System.out.println("Show the edit button for this post");
//        }
//
//        if(isLoggedIn) {
//            System.out.println("Welcome to our website!");
//        }

//        boolean isAdmin = true;
//        boolean isLoggedIn = true;
//        boolean isOwner = false;
//
//        if(isLoggedIn && isAdmin){
//            System.out.println("Show the 'admin' button on the home page and all recent posts by all users.");
//        } else if (isLoggedIn && isOwner){
//            System.out.println("Show the 'my account' button with this user's most recent posts.");
//        } else if (isLoggedIn){
//            System.out.println("Show a 'create post' button as well as examples of posts by other users.");
//        } else if (!isLoggedIn){
//            System.out.println("Show the login/registration page to begin use of the application");
//        }

        //Switch/case statement
        int diceRoll = (int) (Math.random() * 6 - 1 + 1) + 1;
        System.out.println("diceroll = " + diceRoll);

        switch(diceRoll){
            case 1:
                System.out.println("Rolled a one!");
                break;
            case 2:
                System.out.println("Rolled a two!");
                break;
            case 3:
                System.out.println("Rolled a three!");
                break;
            case 4:
                System.out.println("Rolled a four!");
                break;
            case 5:
                System.out.println("Rolled a five!");
                break;
            case 6:
                System.out.println("Rolled a six!");
                break;
        }
    }
}
