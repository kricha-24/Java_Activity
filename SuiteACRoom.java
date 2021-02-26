
public class SuiteACRoom extends HotelRoom {
	private int ratePerSqFeet;


	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = 15;
	}
	public SuiteACRoom(int ratePerSqFeet) {
		super();
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public SuiteACRoom() {
		super();
	}
	
	public int getRatePerSqFeet () {
		if (hasWifi == true) {
			return ratePerSqFeet +2;
		}else {
			return ratePerSqFeet;
		}
	}
	
}
