public class Main2 {
    public static void main(String[] args) {
        Book1[] book1s = new Book1[3];

        book1s[0]= new Book1("Falling in love");
        book1s[1]= new Book1("Maira the innocent girl");
        book1s[2]=new Book1("The Godfather");

        for (Book1 book1 : book1s) {
            book1.borrow();

        }
    }
}

