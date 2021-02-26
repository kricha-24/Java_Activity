
public class Vehicle {

	private String vehicleNumber, make;
	private String fuelType;
	private String fuelCapacity;
	private int cc;
	
	public Vehicle() {
		super();
	}

	public Vehicle(String vehicleNumber, String fuelType, String fuelCapacity, int cc) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(String fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	void displayMake() {
		System.out.println("Make of the vehicle: "+make);
	}
	void displayBasicInfo(){
		System.out.println("Vehicle Number= " + vehicleNumber + ", Fuel Type= " + fuelType + ", Fuel Capacity= " + fuelCapacity
				+ ", cc= " + cc);
		
	}

	void displayDetailInfo() {
		}

	public void setkickStart(String string) {
		
		
	}

	}
	
