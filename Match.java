
public class Match {
	protected int currentscore;
	protected float currentover;
	protected int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public Match(int currentscore, float currentover, int target) {
		super();
		this.currentscore = currentscore;
		this.currentover = currentover;
		this.target = target;
	}
	public Match() {
		super();
	}
	public float calculateRunRate(int y, int z, int w) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
