public abstract class Movie {
    private String title;
    private String genre;
    private boolean rented;

    public Movie(String title, String genre) {
        setTitle(title);
        setGenre(genre);
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public boolean isRented() {
        return rented;
    }
    public void setRented(boolean rented) {
        this.rented = rented;
    }
    public abstract void rent();
}
