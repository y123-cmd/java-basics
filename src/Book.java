public class Book extends LibraryItem {
    private String author;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author){
        if(author==null || author.trim().isEmpty()){
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        this.author = author;
    }
    public Book(String title, String author, String itemId) {
        super(title, itemId);
        setAuthor(author);
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + getTitle() + ", by: " +  getAuthor() + ", ID: " + getItemId() + ", Available : " + (isAvailable()? "yes" : "no"));
    }
}
