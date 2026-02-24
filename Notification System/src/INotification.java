interface  INotification {
    void sendNotification();
    String getDetails();
    String getSender();
    NotificationPriority getPriority();
}
