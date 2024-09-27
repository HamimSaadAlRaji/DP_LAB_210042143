public class Carpool implements IRide{

    int person;
    public Carpool(int person){
        this.person=person;
    }
    @Override
    public double calculateFare(double distance) {
        return (distance *25)/this.person;
    }
}