
public class DeluxeRoom extends HotelRoom {
	protected int ratePerSqFeet;
	
	public DeluxeRoom() {
		super();
	}
	
	public DeluxeRoom(int ratePerSqFeet) {
		super();
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	
	public int getRatePerSqFeet() {
		if (hasWifi == true) {
			return ratePerSqFeet +2;
		}else {
			return ratePerSqFeet;
		}
		
	}
	
}
