
public class DishTools {

    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName() {
        System.out.println(Dish.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost() {
        if (AVERAGE_COST_OF_DISH_IN_CENTS >= Dish.costInCents) {
            System.out.println("Less expensive than average");
        } else if (AVERAGE_COST_OF_DISH_IN_CENTS <= Dish.costInCents) {
            System.out.println("More expensive than average");
        }
    }

    public boolean flipRecommendation() {
        if (Dish.wouldRecommend == true) {
            return Dish.wouldRecommend = false;
        } else {
            return Dish.wouldRecommend = true;
        }
    }

}
