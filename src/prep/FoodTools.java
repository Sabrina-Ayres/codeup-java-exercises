package prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FoodTools {

    public static void initializeApp(){
        int caloriesConsumed = printConsumeFoodsAndCountCalories(getFoods());
        System.out.printf("Total Calories Consumed: %s", caloriesConsumed);
    }

    public static ArrayList<Food> getFoods(){
        return new ArrayList<>(Arrays.asList(
                new Pizza("Pepperoni Lovers Pizza", "ALL THE PEPS", 1200, "Thin", true),
                new Pizza("Cheese Pizza", "Cheese on cheese on cheese", 6000, "Stuffed", false),
                new Ramen("Spicy Miso Ramen", "No words can describe.", 800, "Miso", true)));
    }

    //TODO: Make this better!
    public static int printConsumeFoodsAndCountCalories(ArrayList<Food> foods){
        int caloriesConsumed = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------");
        for (Food food : foods){
            System.out.println(getPrintableString(food.getFullDescription()));

            System.out.println("Would you like to eat this? (y/n)");

            String response = sc.nextLine().toLowerCase();

            if (response.equals("y")){
                food.consume();
                caloriesConsumed += food.getCalories();
            }
        }

        return caloriesConsumed;
    }

    public static String getPrintableString(List<String> strings){
        StringBuilder printableString = new StringBuilder();
        for (String string : strings){
            printableString.append(string).append("\n");
        }
        printableString.append("------------------------\n");

        return printableString.toString();
    }
}


