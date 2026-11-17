package in.omkaleshvar;

public class orderService {
      emailService notification = new emailService();
    public void placeOrder() {
        System.out.println("Order placed");
        notification.sendNotification(); 
    }
}
