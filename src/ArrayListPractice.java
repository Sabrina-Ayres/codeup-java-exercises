import java.util.ArrayList;

public class ArrayListPractice<numbers> {

    public static void main(String[] args) {

        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Roses");
        flowers.add("Peonies");
        flowers.add("Lavender Stock");

        flowers.set(2, "Dogwood");

        System.out.println(flowers);

//        // We'll start by defining an array list and adding some items to it
//        ArrayList<String> roasts = new ArrayList<>();
//        roasts.add("light");
//        roasts.add("medium");
//        roasts.add("medium");
//        roasts.add("dark");
//
//        System.out.println(roasts); // [light, medium, medium, dark]
//
//// using .contains
//        System.out.println(roasts.contains("dark"));
//        roasts.contains("espresso"); // false
//
//// using .lastIndexOf
//        System.out.println(roasts.lastIndexOf("medium"));
//
//// using .isEmpty
//        roasts.isEmpty(); // false
//        ArrayList<String> emptyList = new ArrayList<>();
//        emptyList.isEmpty(); // true
//
//// .remove has two variants
//        roasts.remove("espresso"); // false
//        roasts.remove("medium"); // true
//        System.out.println(roasts); // [light, medium, dark]
//
//        roasts.remove(2); // "dark"
//        System.out.println(roasts); // [light, medium]
//
    }

}
