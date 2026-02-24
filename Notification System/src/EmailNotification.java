public class EmailNotification implements INotification {
    private String recipientEmail;
    private String subject;
    private String body;
    private NotificationPriority priority;


    public void setPriority(NotificationPriority priority) {
        this.priority = priority;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        if (!recipientEmail.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.recipientEmail = recipientEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject.trim().isEmpty()) {
            throw new IllegalArgumentException("subject cannot be empty");
        }
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        if (body.trim().isEmpty()) {
            throw new IllegalArgumentException("body cannot be empty");
        }
        this.body = body;
    }

    public EmailNotification(String recipientEmail, String subject, String body,NotificationPriority priority) {
        setRecipientEmail(recipientEmail);
        setSubject(subject);
        setBody(body);
        setPriority(priority);

    }
    @Override
    public NotificationPriority getPriority() {
        return priority;
    }

    @Override
    public void sendNotification() {
        System.out.println("\uD83D\uDCE7 Sending Email... [Priority: " + priority+"]");
        System.out.println("To:" + getRecipientEmail());
        System.out.println("Subject:" + getSubject());
        System.out.println("Body:" + getBody());
        System.out.println("✅ Email sent");
    }

    @Override
    public String getDetails() {
        return "sending email to: " +  getRecipientEmail()  + getSubject() + getBody() + getSender() + getPriority();
    }

    @Override
    public String getSender() {
        return "EMAIL";
    }
}
