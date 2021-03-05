import java.util.Scanner;

public class Practice {


    public static void main(String[] args) {

//        System.out.print(multiply(4, 5));

//        printMultiply(2, 5);

//        multiplyUserInput();

        getNames("Bob");
        getNames("Bob", "Tom");
        getNames("Bob", "Tom", "Tim");

    }

    // ============ Mini Exercise #1 =============
    /* TODO:
     *   -Write a public static method which returns an integer
     *   -The method should take in *two parameters* and *return* the product of multiplying them
     *   -Print the output to the console by calling the method, passing in params, and logging its output
     *   BONUS: Use the Scanner class to get the numbers from the user input
     * */


//    public static int multiply(int numOne, int numTwo) {
//        return numOne * numTwo;
//    }
//
//    public static void printMultiply(int numOne, int numTwo) {
//        System.out.println(multiply(numOne, numTwo));
//    }
//
//    public static void multiplyUserInput (){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter two numbers you would like to multiply: ");
//        int numOne = sc.nextInt();
//        int numTwo = sc.nextInt();
////        System.out.println("Your numbers are: %s and %s \n\nPress return to continue\n" numOne, numTwo);
//
//        printMultiply(numOne, numTwo);
//    }

    /* TODO: Write a set of overloaded public static void methods which can take in 1-3 names and print them to the console
     *   -Call each of the methods, passing in the names for each
     *   -Minus 1000pts if you don't use an oxford comma on the 3 param version
     *   BONUS: Use the Scanner class to get the names from user input
     *  */

    public static void getNames (String nameOne) {
        System.out.printf("Hey %s \n", nameOne);
    }

    public static void getNames (String nameOne, String nameTwo) {
        System.out.printf("Hey %s & %s \n", nameOne, nameTwo);
    }

    public static void getNames (String nameOne, String nameTwo, String nameThree) {
        System.out.printf("Hey %s, %s, & %s \n", nameOne, nameTwo, nameThree);
    }

}