// Base Ride class
public abstract class Ride {
    protected int id;
    protected String pickupLocation;
    protected String dropOffLocation;
    protected double fare;
    protected double distance;

    public Ride(int id, String pickupLocation, String dropOffLocation) {
        this.id = id;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
    }

    public abstract void calculateFare();

    public void assignDriver(Driver driver) {
    }

    public void completeTrip() {
    }
}

class CarpoolRide extends Ride {
    public CarpoolRide(int id, String pickupLocation, String dropOffLocation) {
        super(id, pickupLocation, dropOffLocation);
    }

    @Override
    public void calculateFare() {
    }
}

class LuxuryRide extends Ride {
    public LuxuryRide(int id, String pickupLocation, String dropOffLocation) {
        super(id, pickupLocation, dropOffLocation);
    }

    @Override
    public void calculateFare() {
    }
}

class BikeRide extends Ride {
    public BikeRide(int id, String pickupLocation, String dropOffLocation) {
        super(id, pickupLocation, dropOffLocation);
    }

    @Override
    public void calculateFare() {
    }
}
