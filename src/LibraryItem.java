public abstract class LibraryItem {
    private String title;
    protected String itemId;
    private boolean isAvailable;

    public LibraryItem(String title, String itemId) {
        setTitle(title);
        setItemId(itemId);
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;

    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        if (itemId == null || itemId.isEmpty() || (itemId.length() <= 3)) {
            throw new IllegalArgumentException("ItemId cannot be empty");
        }
        this.itemId = itemId;
    }
    public void borrowItem(){
       if(isAvailable){
           System.out.println(title + "has been borrowed");
       }
    }
    public void returnItem(){
        if(isAvailable){
            System.out.println(title + "has been returned");
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public abstract void displayInfo();
}


