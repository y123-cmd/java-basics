public class PushNotification extends Notification{
    private String App;
    public String getApp() {
        return App;
    }
    public void setApp(String App) {
        this.App = App;
    }
    @Override
    public void send(String message){
        System.out.println("Sending PUSH notification to YvonneApp: Deposit successful");
    }
}
