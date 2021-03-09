import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

//        System.out.println(getRandomNumber());
        getUserGuess();
//        getMatch();


    }

//    public static int getRandomNumber() {
//        int randomNum = (int) (Math.random() * 100) + 1;
//        return randomNum;
//    }

    public static void getUserGuess() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100: ");
        int userGuess = sc.nextInt();
        int randomNum = (int) (Math.random() * 100) + 1;
        if (userGuess < 1 || userGuess > 100) {
            System.out.println("Your guess is not within the set range...Try again...");
        } else {

            getMatch(userGuess, randomNum);
        }
    }



    public static String getMatch(int guess, int randomNum) {

        if (randomNum == guess) {
            return "GOOD GUESS!!!";
        } else if (randomNum > guess) {
            return "HIGHER!";
        } else if (randomNum < guess) {
            return "LOWER!";
        }
        getUserGuess();
        return null;
    }


}
