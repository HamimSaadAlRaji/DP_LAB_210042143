public class RideProcess {
    public double ProcessRide(double distance,IRide ride){
        return ride.calculateFare(distance);
    }
}
