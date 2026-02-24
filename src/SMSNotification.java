public class SMSNotification extends Notification {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public void send(String message) {
        System.out.println("Sending SMS to 0735287957: " + "Deposit successful");
    }
}
