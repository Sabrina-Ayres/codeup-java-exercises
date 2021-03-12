package util;

import java.util.Scanner;

public class Input {

    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {
        return sc.nextLine();
    }

    public boolean yesNo() {
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Try again! Enter a number between " + min + " & " + max + ":");
            sc.nextLine();
            return getInt();
        }
    }

    public int getInt() {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Try again!");
            sc.nextLine();
            return getInt();
        }
    }


    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("Try again! Enter a number between " + min + " & " + max + ":");
            sc.nextLine();
            return getDouble();
        }
    }

    public double getDouble() {
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Try again!");
            sc.nextLine();
            return getDouble();
        }
    }

}
