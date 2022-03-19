package startercode;

public class Driver extends User {

	Driveable vehicle = new Vehicle();
    
    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public Driver() {}
    
    public Driveable getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
    }
    
	public void drive() {
		vehicle.drive();
	}

}
