package prep;

public class Pizza extends Food{

    private String crust;
    private Boolean hasPepperoni;

    public Pizza(String name, String description, int calories) {
        super(name, description, calories);
    }

    public Boolean getHasPepperoni() {
        return hasPepperoni;
    }

    public void setHasPepperoni(Boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

}
