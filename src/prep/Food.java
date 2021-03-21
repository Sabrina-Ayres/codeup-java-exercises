package prep;

public class Food {

    private String name;
    private String description;
    private int calories;

    public Food (String name, String description, int calories) {
        try {
            this.name = name;
            this.description = description;
            this.calories = calories;
        } catch (IllegalArgumentException e) {
            System.out.printf("Please fill in %s correctly.", e.getMessage());
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


}
