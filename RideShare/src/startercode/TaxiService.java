package startercode;

public class TaxiService {

	public Ride process(Driver driver, Passenger[] passengers) {
		Ride ride = new Ride();
        ride.setDriver(driver);
        ride.setPassengers(passengers);
            return ride;
	}
	
}

