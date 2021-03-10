public class Dish {

    public static int costInCents;
    public static String nameOfDish;
    public static boolean wouldRecommend;

    public void printSummary() {
        System.out.printf("Cost: %d \nName: %s \nRecommended: %s", costInCents, nameOfDish, wouldRecommend);
    }


}


