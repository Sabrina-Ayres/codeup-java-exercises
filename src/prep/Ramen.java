package prep;

public class Ramen extends Food{

    private String brothBase;
    private Boolean isSpicy;

    public Ramen(String name, String description, int calories) {
        super(name, description, calories);
    }

    public String getBrothBase() {
        return brothBase;
    }

    public void setBrothBase(String brothBase) {
        this.brothBase = brothBase;
    }

    public Boolean getSpicy() {
        return isSpicy;
    }

    public void setSpicy(Boolean spicy) {
        isSpicy = spicy;
    }

}
