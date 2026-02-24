import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Movie> movies;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Movie> getMovies() {
        return movies;
    }
    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }
    public void rentMovie(Movie movie){
        this.movies.add(movie);
    }
    public void returnMovie(Movie movie){
        this.movies.remove(movie);
    }
    public Customer(String name){
        this.name = name;
        this.movies = new ArrayList<>();
    }
}
