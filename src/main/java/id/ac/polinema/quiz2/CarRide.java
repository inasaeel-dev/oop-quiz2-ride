package id.ac.polinema.quiz2;

public class CarRide extends Ride implements Insurable {

  public CarRide (String rideId, Passenger passenger, double distanceKm){
    super(rideId, passenger, distanceKm);
  }
  @Override 
  public double calculateFare(){
    return 3000.0;
  }
  @Override 
  public double insuranceFee(){
    return 5000.0;
  }
}