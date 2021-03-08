import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(addition(4, 4));
        System.out.println(subtraction(4, 4));
        System.out.println(multiplication(4, 4));
        System.out.println(division(4, 4));
        System.out.println(mod(4, 4));


        getInteger(1, 100);

//        System.out.println(factorial(5));

        getUserNum();

    }


    //////////////////////////


    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        return num1 % num2;
    }


    //////////////////////////////


    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
           return userInput;
        } else {
            return getInteger(min, max);
        }
    }


    /////////////////////////////


    public static int getUserNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10...");
        int userInput = sc.nextInt();
        System.out.println(userInput);
        System.out.println("Would you like to continue? Yes or No?");
        String userResponse = sc.next().toLowerCase();
        if (userResponse.equals("yes")) {
            long userFac = factorial(userInput);
            System.out.println(userFac);
        }
        return userInput;
    }

    public static long factorial(int num) {
        long fac = 1;
        for (int i = 2; i <= num; i ++) {
            fac = fac * i;
        }
        return fac;
    }


    /////////////////////////////







}
