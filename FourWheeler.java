
public class FourWheeler extends Vehicle {
	private String audioSystem;
	private int numberOfDoors;
		
	public FourWheeler() {
		super();
	}
	
	public FourWheeler(String audioSystem, int numberOfDoors) {
		super();
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayDeatilInfo() {
		System.out.println("Audio System= " + audioSystem + ", Number Of Doors=" + numberOfDoors);
	}


}
