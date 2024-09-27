public class Trip {
    private String id;
    private String pickupLocation;
    private String dropOffLocation;
    private String rideType;
    private String status;
    private double fare;
    private double distance;

    private Rider rider;
    private Driver driver;
    private Notifications notifications;

    // Constructor
    public Trip(String id, String pickupLocation, String dropOffLocation, String rideType, double distance, Rider rider, Driver driver, Notifications notifications) {
        this.id = id;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideType = rideType;
        this.status = "Pending"; // Initial status
        this.distance = distance;
        this.rider = rider;
        this.driver = driver;
        this.notifications = notifications;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getPickupLocation() { return pickupLocation; }
    public String getDropOffLocation() { return dropOffLocation; }
    public String getRideType() { return rideType; }
    public String getStatus() { return status; }
    public double getFare() { return fare; }
    public double getDistance() { return distance; }

    public void setStatus(String status) {
        this.status = status;
    }}