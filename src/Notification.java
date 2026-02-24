public abstract class Notification {
    private String recipient;
    public String getRecipient() {
        return recipient;
    }
    public void setRecipient(String recipient) {
        if(recipient == null || recipient.isEmpty()){
            System.out.println("Recipient cannot be empty");
        }
        this.recipient = recipient;
    }
    public abstract void send(String message);
}
