public class Main1 {
    public static void main(String[] args) {
        LibraryItem[] item = {
                new Book("Rooters", "George Ordwel", "B032"),
                new DVD("Inception", "D001", 148),
                new Magazine("National Geographic", "M001", 245),
                new Magazine("National Geographic", "M001", 245)

        };

        for (LibraryItem libraryItem : item) {
            libraryItem.displayInfo();
            libraryItem.borrowItem();
            libraryItem.displayInfo();
            libraryItem.returnItem();
            System.out.println();


        }
    }

    }

