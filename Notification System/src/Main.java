public class Main{
    public static void main(String[] args){
        EmailNotification email = new EmailNotification("yvonnebosire24@gmail.com","Job Application"," thanks for applying",NotificationPriority.URGENT);
        email.sendNotification();
        System.out.println(email.getDetails());
        System.out.println(email.getSender());





        SMSNotification sms = new SMSNotification("07123456789","Your verification code is 12345",NotificationPriority.HIGH);
        sms.sendNotification();
        System.out.println(sms.getDetails());
        sms.getSender();



        PushNotification push = new PushNotification("DEVICE_12345", "New Message!","You have 3 new messages waiting",NotificationPriority.HIGH);
        System.out.println(push.getDetails());
        push.sendNotification();
        System.out.println(push.getSender());

    }
}