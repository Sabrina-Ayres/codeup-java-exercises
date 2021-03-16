package animals;

public class Tiger extends Feline {

    private final String pattern;

    public Tiger(String size, String coat, String pattern) {
        super(size, coat);
        this.pattern = pattern;
    }

    public void printDelimiter() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


    public void printDetails() {

    }
}
