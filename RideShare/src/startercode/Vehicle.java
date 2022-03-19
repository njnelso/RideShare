package startercode;

public class Vehicle implements Driveable {

	private String year;
	private String make;
	private String model;
	private String plateNumber;
	private boolean inTransit;
	
    public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getPlateNumber() {
		return plateNumber;
    }
    
    public void setInTransit(boolean inTransit) {
		this.inTransit = inTransit;
    }
    
	public boolean isInTransit() {
		return inTransit;
	}
    
    public void drive() {
        this.inTransit = true;
    }    
}