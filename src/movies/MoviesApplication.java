package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        boolean running = true;

        while(running) {

            System.out.println(movieMenuOptions());

            int response = userChoice();
            running = executeUserChoice(response);

        }

    }

    private static boolean executeUserChoice(int choice) {
        boolean continueRunningApp = true;
        switch (choice) {
            case 0:
                continueRunningApp = false;
                break;
            case 1: //View all movies
                System.out.println("\n");
                for(Movie movie : MoviesArray.findAll()) {
                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                }
                System.out.println("\n");
                break;
            case 2: //animated
                System.out.println("\n");
                selectedCategory("animated");
                System.out.println("\n");
                break;
            case 3: //drama
                System.out.println("\n");
                selectedCategory("drama");
                System.out.println("\n");
                break;
            case 4: //horror
                System.out.println("\n");
                selectedCategory("horror");
                System.out.println("\n");
                break;
            case 5: //scifi
                System.out.println("\n");
                selectedCategory("scifi");
                System.out.println("\n");
                break;
        }
        return continueRunningApp;
    }

    public static void selectedCategory(String category) {
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
            }
        }
    }

    public static String movieMenuOptions() {
        String options = "\n" +
                "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category";
        return options;
    }

    public static int userChoice() {
        Input input = new Input();
        System.out.println("Enter your choice: ");
        int response = input.getInt(0, 5);
        return response;
    }

}
