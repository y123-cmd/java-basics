public class Bluray extends Movie {
    public Bluray(String title, String genre) {
        super(title, genre);
        setGenre(genre);

    }
    @Override
    public void rent(){
        System.out.println("Bluray " + getTitle() + " rented ");
    }
}
