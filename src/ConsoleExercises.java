import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.", pi);

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number:");
//        int userNum = sc.nextInt();
//
//        System.out.print("Enter three words:");
//
//        String userOne = sc.next();
//        String userTwo = sc.next();
//        String userThree = sc.next();
//
//        System.out.println(userOne);
//        System.out.println(userTwo);
//        System.out.println(userThree);

//        System.out.print("Enter your favorite saying:");
//        String saying = sc.nextLine();
//        System.out.println(saying);

        System.out.print("What is the classroom's length and width?");

        int length = sc.nextInt();
        int width = sc.nextInt();

        int area = length * width;
        int perimeter = (length * 2) + (width * 2);

        System.out.print("The area of the Codeup classroom is " + area +
                "ft and the perimeter of the classroom is " + perimeter + "ft.");


    }
}
