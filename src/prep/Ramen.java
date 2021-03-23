package prep;

import java.util.ArrayList;

public class Ramen extends Food {

    private String brothBase;
    private boolean isSpicy;

    public Ramen(String name, String description, int calories, String brothBase, boolean isSpicy) {

        super(name, description, calories);
        this.brothBase = brothBase;
        this.isSpicy = isSpicy;
    }

    public String getBrothBase() {
        return brothBase;
    }

    public void setBrothBase(String brothBase) {
        this.brothBase = brothBase;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public ArrayList<String> getFullDescription() {

        String nameString = super.getName();
        String descriptionString = super.getDescription();
        String caloriesString = super.getCalories() + "";
        String brothBaseString = getBrothBase();
        String isSpicyString = isSpicy()
                ? "Spicy"
                : "Not Spicy";

        ArrayList<String> list = new ArrayList<>();

        list.add(nameString);
        list.add(descriptionString);
        list.add(caloriesString);
        list.add(brothBaseString);
        list.add(isSpicyString);

        return list;

        }
    }





//new ArrayList<>(Arrays.asList(….)  ?

//return new ArrayList<>(Arrays.asList(
//        name,
//        description,
//        calories,
//        seasoned
//));
