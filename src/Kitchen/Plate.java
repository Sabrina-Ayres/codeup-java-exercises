package Kitchen;

public class Plate extends KitchenTool {

    Plate(String tool) {
        super(tool);
    }

    public void wash() {
        System.out.println("Washing plate....");
    }

}
