public class DVD extends LibraryItem {
    private int duration;

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public DVD(String title, String itemId, int duration) {
        super(title, itemId);
        setDuration(duration);

    }
    @Override
    public void displayInfo(){
        System.out.println("DVD: " + getTitle() + ", Duration: " + getDuration() + " minutes ,"+ " ID " +getItemId() + ", available: " + (isAvailable()? "yes" : "no") );

    }
}
