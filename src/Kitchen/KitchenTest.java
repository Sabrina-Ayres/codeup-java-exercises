package Kitchen;

public class KitchenTest {

    public static void main(String[] args) {


        Ingredient strawberryJelly = new Jelly();
        strawberryJelly.throwAway();
        ((Jelly) strawberryJelly).printCals();

    }

}
