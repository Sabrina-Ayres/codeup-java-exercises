package animals;

public abstract class Feline implements Describable{

    protected final String size;
    protected final String coat;

    public Feline(String size, String coat) {
        this.size = size;
        this.coat = coat;
    }

    public abstract void printDelimiter();

}
