public class Main3 {
    public static void main(String[] args) {
        Movie[] movie = new Movie[4];
        movie[0] = new DVD1("Antrophy", "Horror");
        movie[1] = new DVD1("Legends of the seeker", "Romance");
        movie[2] = new Bluray("Cocomelons", "Cartoon");
        movie[3] = new Bluray("Timed out", "Horror");

        for (Movie m : movie) {
            m.rent();
        }
    }
}
