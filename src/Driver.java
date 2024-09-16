public class Driver {
    private int id;
    private String name;
    private String vehicleType;
    private String location;
    private boolean availability;

    public Driver(int id, String name, String vehicleType, String location) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.availability = true;
    }

    public void acceptRide(Ride ride) {

    }

    public void rateRider(Rider rider, int rating) {

    }

    public void updateLocation(String location) {
        this.location = location;
    }

    public void startTrip(Ride ride) {

    }
}