public class RideSharingApp {
    public static void main(String[] args) {
        Rider rider = new Rider(1, "Hamim", "Dhaka");

        Driver driver = new Driver(1, "Abdul Kuddus", "Luxury Car", "CTG");


        Notifications notificationService = new SMSNotification();
        notificationService.sendNotification("Your ride has been completed.");
    }
}
