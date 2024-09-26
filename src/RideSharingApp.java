public class RideSharingApp {
    public static void main(String[] args) {
        Rider rider = new Rider(1, "Hamim", "Dhaka");

        Driver driver = new Driver(1, "Abdul Kuddus", "Luxury Car", "CTG");

        Ride luxuryRide = new LuxuryRide(1, "Dhaka", "CTG");
        luxuryRide.calculateFare();


        luxuryRide.assignDriver(driver);


        driver.startTrip(luxuryRide);


        luxuryRide.completeTrip();

        Notifications notificationService = new SMSNotification();
        notificationService.sendNotification("Your ride has been completed.");
    }
}
