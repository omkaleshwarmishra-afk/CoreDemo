package in.omkaleshvar.notification;

public class emailService  implements NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("email notification sent");
    }
}
