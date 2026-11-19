package in.omkaleshvar;

import in.omkaleshvar.notification.NotificationService;
import in.omkaleshvar.notification.SmsService;
import in.omkaleshvar.notification.emailService;

public class orderService {
      NotificationService notification;

    public orderService(NotificationService notification) {
        this.notification = notification;
    }

    public void placeOrder() {
        System.out.println("Order placed");
        notification.sendNotification();
    }
}
