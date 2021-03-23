package prep;

import java.util.ArrayList;

public class Pizza extends Food{

    private String crust;
    private boolean isSeasoned;

    public Pizza(String name, String description, int calories, String crust, boolean isSeasoned) {

        super(name, description, calories);
        this.crust = crust;
        this.isSeasoned = isSeasoned;
    }

    public boolean isSeasoned() {
        return isSeasoned;
    }

    public void setSeasoned(boolean seasoned) {
        isSeasoned = seasoned;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }


    public ArrayList<String> getFullDescription(){

        String nameString = super.getName();
        String descriptionString = super.getDescription();
        String caloriesString = super.getCalories() + "";
        String crustString = getCrust();
        String isSeasonedString = isSeasoned()
                ? "Seasoned"
                : "Not Seasoned";

        ArrayList<String> list = new ArrayList<>();

        list.add(nameString);
        list.add(descriptionString);
        list.add(caloriesString);
        list.add(crustString);
        list.add(isSeasonedString);

        return list;
    }


}
