package animals;

public class Persian extends Feline {

    private final String variants;

    public Persian(String size, String coat, String variants) {
        super(size, coat);
        this.variants = variants;
    }

    public void printDelimiter() {
        System.out.println("****************************");
    }

    public void printDetails() {

    }
}
