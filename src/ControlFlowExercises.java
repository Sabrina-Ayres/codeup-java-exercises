import java.util.Locale;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i);
//            i++;


//        int i = 100;
//        do {
//            i = i - 5;
//            System.out.println(i);
//        }
//        while (i > -10);


//        long i = 2;
//        do {
//            i = i * i;
//            System.out.println(i);
//        }
//        while (i < 1000000);


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}

//%8d
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number:");
//        int userNum = sc.nextInt();
//        long i = 1;
//
//        System.out.println("You entered number " + userNum + "!");
//        System.out.println();
//        System.out.println("Here is your table!");
//        System.out.println();
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        while (i <= userNum) {
//            long numSq = i * i;
//            long numCub = i * i * i;
//            int n = 5;
//            String s = String.format("%1$"+n+"s", "");
//            System.out.println(i + s + " | " + numSq + s + "  | " + numCub);
//            i++;
//        }



//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Do you want to enter a grade? ");
//        String userResponse = sc.nextLine().toLowerCase();
//
//        if (userResponse.equals("no")) {
//            System.out.print("Maybe next time...");
//        }
//
//         if (userResponse.equals("yes")) {
//             System.out.print("Enter your grade: ");
//             int userNum = sc.nextInt();
//
//             if (userNum <= 100 && userNum >= 88) {
//                 System.out.print("You got an A!");
//             } else if (userNum < 88 && userNum >= 80) {
//                 System.out.print("You got an B!");
//             } else if (userNum < 80 && userNum >= 67) {
//                 System.out.print("You got an C!");
//             } else if (userNum < 67 && userNum >= 60) {
//                 System.out.print("You got an D!");
//             } else if (userNum <= 59) {
//                 System.out.print("Bummer! You got an F!");
//             }
//         }

//    }
//}
