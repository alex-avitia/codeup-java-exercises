public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(addition(3, 5));
        System.out.println(subtraction(6, 3));
        System.out.println(multiplication(4, 6));
        System.out.println(division(6, 2));
        System.out.println(modulus(4, 3));

    }

    public static int addition(int a, int b){


        return a + b;
    }

    public static int subtraction(int a, int b){

        return a - b;
    }

    public static int multiplication(int a, int b){
        int c = 0;
        for (int i = 1; i <= b; i++) {
            c += addition(a, a);
        }

        return c;
    }

    public static int division(int a, int b){


        return a / b;
    }

    public static int modulus(int a, int b){


        return a % b;
    }

}
