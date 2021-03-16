package animals;

public class Dog extends Canine {
    private final String furColor;

    public Dog(String sound, String size, String subSpecies, String commonName, String furColor) {
        super(size, commonName, subSpecies, sound);
        this.furColor = furColor;
    }


    public void printDelimiter() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void printFurColor() {
        System.out.printf("Fur Color: %s\n", this.furColor);
    }

    public void printDetails() {
        makeSound();
        printDelimiter();
        printSubSpecies();
        printCommonName();
        printSize();
        printFurColor();
        printDelimiter();
    }
}