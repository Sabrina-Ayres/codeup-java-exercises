package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.next();
    }

    public boolean yesNo() {
        String input = scanner.next();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }
//
//    public int getInt() {
////        System.out.println("Enter a number: ");
//        try {
//            return Integer.valueOf(getString());
//        } catch (Exception e) {
//            System.out.println("That is not a valid number. Please try again.");
//            return getInt();
//        }
//    }

    public int getInt() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Try again!");
            scanner.nextLine();
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Out of range. Please enter a number between " + min + " and " + max + ".");
            return getInt(min, max);
        }
    }

    public double getDouble() {
        System.out.println("Enter a number: ");
        try {
            return Double.valueOf(getString());
        } catch (Exception e) {
            System.out.println("That is not a valid number. Please try again.");
            return getDouble();
        }
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("Out of range. Please enter a number between " + min + " and " + max + ".");
            return getDouble(min, max);
        }
    }


    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Please enter a number between 1.5 and 3.5");
        double userInt = input.getDouble(1.5, 3.5);
        System.out.println("You entered: " + userInt);
    }



}


//package util;
//
//import java.util.Scanner;
//
//public class Input {
//
//    private Scanner sc;
//
//    public Input() {
//        this.sc = new Scanner(System.in);
//    }
//
//    public String getString() {
//        return sc.nextLine();
//    }
//
//    public boolean yesNo() {
//        String input = sc.nextLine();
//        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public int getInt(int min, int max) {
//        int userInt = getInt();
//        if (userInt >= min && userInt <= max) {
//            return userInt;
//        } else {
//            System.out.println("Try again! Enter a number between " + min + " & " + max + ":");
//            sc.nextLine();
//            return getInt();
//        }
//    }
//


//
//
//    public double getDouble(double min, double max) {
//        double userDouble = getDouble();
//        if (userDouble >= min && userDouble <= max) {
//            return userDouble;
//        } else {
//            System.out.println("Try again! Enter a number between " + min + " & " + max + ":");
//            sc.nextLine();
//            return getDouble();
//        }
//    }
//
//    public double getDouble() {
//        if (sc.hasNextDouble()) {
//            return sc.nextDouble();
//        } else {
//            System.out.println("Try again!");
//            sc.nextLine();
//            return getDouble();
//        }
//    }
//
//}
