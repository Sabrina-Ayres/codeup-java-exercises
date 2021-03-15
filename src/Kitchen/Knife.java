package Kitchen;

public class Knife extends KitchenTool {

    Knife(String tool) {
        super(tool);
    }

    public void wash() {
        System.out.println("Washing the knife...");
    }

}
