public class PushNotification implements INotification {
    private String deviceToken;
    private String title;
    private String message;
    private NotificationPriority priority;


    public void setPriority(NotificationPriority priority) {
        this.priority = priority;
    }

    public String getDeviceToken() {
        return deviceToken;
    }
    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public PushNotification(String deviceToken, String title, String message,NotificationPriority priority) {
        setDeviceToken(deviceToken);
        setTitle(title);
        setMessage(message);
        setPriority(priority);

    }
    @Override
    public NotificationPriority getPriority() {
        return priority;
    }

    @Override
    public void sendNotification() {
        System.out.println("\uD83D\uDD14 Sending Push Notification...[Priority:" + priority + "]");
        System.out.println("Device Token: " + getDeviceToken());
        System.out.println("Title: " + getTitle());
        System.out.println("Message: " + getMessage());
        System.out.println("✅ Push notification sent");
    }
    @Override
    public String getDetails(){
       return "Push to " + getDeviceToken() + " : " + getTitle();
    }
    @Override
    public String getSender(){
        return "PUSH";
    }
}
