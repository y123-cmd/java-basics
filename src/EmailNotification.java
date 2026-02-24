public class EmailNotification extends Notification {
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL to yvonne@gmail.com: Transaction successful");
    }
}
