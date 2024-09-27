public class LuxuryRide implements IRide {
    @Override
    public double calculateFare(double distance) {
        return distance * 50;
    }
}