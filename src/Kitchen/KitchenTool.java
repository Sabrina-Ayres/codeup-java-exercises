package Kitchen;

public class KitchenTool {

    private final String tool;

    KitchenTool(String tool) {
        this.tool = tool;
    }

    public boolean getSharp() { return isSharp; }
    public boolean isSharp;

    public int getNumberOf() { return numberOf; }
    public int numberOf;

    public void wash() {
        System.out.println("Washing....");
    }
}
