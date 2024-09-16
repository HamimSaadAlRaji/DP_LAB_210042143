public class Rider {
    private int id;
    private String name;
    private String location;
    private Payment preferredPaymentMethod;

    public Rider(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void requestRide(Ride ride) {

    }

    public void rateDriver(Driver driver, int rating) {

    }

    public void makePayment(Payment paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}