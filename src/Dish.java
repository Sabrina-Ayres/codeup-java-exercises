public class Dish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary() {
        System.out.printf("Cost: %d \nName: %s \nRecommended: %s", costInCents, nameOfDish, wouldRecommend);
    }


    public static void main(String[] args) {

        Dish d1 = new Dish();
        d1.costInCents = 1000;
        d1.nameOfDish = "BLT";
        d1.wouldRecommend = true;

        d1.printSummary();


    }

}


