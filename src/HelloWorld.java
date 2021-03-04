
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.print("Hello");
//        System.out.print(" World!");

        {
            String firstN = "Sabrina";
            String lastN = "Ayres";

//            System.out.printf("%S %S", firstN, lastN);

            int age = 23;
            String name = "Fred";
            String state = "Texas";

//            System.out.printf("%s is from %s and is %d years old.", name, state, age);

// Fred is from Texas and is 23 years old.
        }

        {
            /* TODO: use the scanner to take in the name of the month you were born and print it back out
            - remember to first prompt the user for the input */

//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("What is your date of birth?");
//            String userInput = sc.next();
//
//            System.out.println("Your date of birth is " + userInput);

/* TODO: use the scanner to take in your birthday as an integer and then name of the month you were born and print it back out
            - remember to first prompt the user for the birthday day of the month and store as an integer
            - next take in name of the month with .nextLine()
            - print out the result
            - use a fix to prevent the month name input from being skipped
         */

            Scanner sc = new Scanner(System.in);

            System.out.print("What day of the month were you born?");
            int userDay = sc.nextInt();
            sc.nextLine();
            System.out.print("What month were you born?");
            String userMonth = sc.nextLine();

            System.out.println("You were born on " + userMonth + " " + userDay);

        }
    }
}

