public class DVD1 extends Movie{

    public DVD1(String title, String genre) {
        super(title, genre);
    }

    @Override
    public void rent(){
        System.out.println("DVD " + getTitle() + " rented ");
    }
}
