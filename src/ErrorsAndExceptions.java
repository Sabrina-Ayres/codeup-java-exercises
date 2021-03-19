import java.util.Scanner;

public class ErrorsAndExceptions {

//    public static void main(String[] args) {
//        String indentationPreference;
//
//        try {
//            indentationPreference = getIndentationPreference();
//            System.out.println("Okay, " + indentationPreference + " is a great choice.");
//        } catch (Exception e) {
//            System.out.println("Uh oh, something went wrong: " + e.getMessage());
//            System.out.println("Here is some more detail:");
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) throws Exception {
        String indentationPreference = getIndentationPreference();
        System.out.println("Okay, " + indentationPreference + " is a great choice.");
    }

    public static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();

        if (indentationPreference.equals("tabs")) {
            throw new Exception("Spaces are superior!");
        }

        return indentationPreference;
    }

}
