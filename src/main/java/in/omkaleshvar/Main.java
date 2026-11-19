package in.omkaleshvar;

import in.omkaleshvar.notification.NotificationService;
import in.omkaleshvar.notification.emailService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NotificationService notification = new emailService();

        orderService order = new orderService(notification);
        order.placeOrder();
    }
}
