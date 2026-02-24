public class Magazine extends LibraryItem{
    private int issueNumber;
    public int getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    public Magazine(String title, String itemId, int issueNumber) {
        super(title, itemId);
        setIssueNumber(issueNumber);
    }
    @Override
    public void displayInfo(){
        System.out.println("Magazine: " + getTitle() + ", issue: " + issueNumber + ", ID: " + getItemId() + ", Available: " + (isAvailable()? "yes" : "no"));

    }
}

