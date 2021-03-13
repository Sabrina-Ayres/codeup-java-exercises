import java.util.Random;

public class ServerNameGenerator {

    public static String[] adj = {"salty", "deep", "proud", "fresh", "brave", "gritty",
    "eager", "robust", "tense", "rough"};

    public static String[] noun = {"snake", "pirate", "castle", "skull", "bed", "cave",
    "treasure", "wizard", "money", "bucket"};


    public static String getName(String[] rando) {
        Random random = new Random();
        int randomNum = random.nextInt(rando.length);
        return rando[randomNum];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:\n" +
                           getName(adj) + "-" + getName(noun));
    }
}
