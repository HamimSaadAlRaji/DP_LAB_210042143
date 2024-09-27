public class BikeRide implements IRide {
    @Override
    public double calculateFare(double distance) {
        return distance *10;
    }
}