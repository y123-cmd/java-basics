public class Main {
    public static void main(String[] args) {
        Notification[] n = {
                new SMSNotification(),
                new EmailNotification(),
                new PushNotification()
        };
        for (Notification notification : n) {
            notification.send("SmsNotification");
        }
    }
}
