package movies;

public class Movie {

    private static String name;
    private static String category;

    public Movie (String name, String category) {
        Movie.name = name;
        Movie.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name){
        Movie.name = name;
    }

    public void setCategory(String category) {
        Movie.category = category;
    }

}
