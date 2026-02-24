public class SMSNotification implements INotification {
    private String phoneNumber;
    private String message;
    private NotificationPriority priority;

    public void setPriority(NotificationPriority priority) {
        this.priority = priority;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        if(message.length() <= 160) {
            this.message = message;

        }else {
            this.message = "Message not validated!";
        }
    }

    public SMSNotification(String phoneNumber, String message, NotificationPriority priority) {
        setPhoneNumber(phoneNumber);
        setMessage(message);
        setPriority(priority);
    }

    @Override
    public NotificationPriority getPriority(){
        return priority;
    }

    @Override
    public void sendNotification() {
        System.out.println("\uD83D\uDCF1 Sending SMS...[Priority: " + priority+"]");
        System.out.println("TO: " + getPhoneNumber());
        System.out.println("MESSAGE: " + getMessage());
        System.out.println("✅ SMS sent...!");
    }
    @Override
    public String getDetails() {
        return "SMS to: " + getPhoneNumber() + " : " + getMessage();
    }
    @Override
    public String getSender() {
        return "SMS";
    }
}
