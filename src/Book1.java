public class Book1 {
    private String title;
    private boolean isBorrowed;


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public Book1(String title) {
        setTitle(title);
        setBorrowed(isBorrowed);
    }
    public void borrow(){
        if(!isBorrowed){
            isBorrowed = true;
            System.out.println("book" + title + " borrowed");
        }
        else{
            System.out.println("book" + title + " is already borrowed");
        }
    }

}
