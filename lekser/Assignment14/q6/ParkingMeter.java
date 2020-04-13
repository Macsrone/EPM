package Assignment14.q6;

public class ParkingMeter {

	int timeLeft=0;
	int maxTime;
	
	
	public ParkingMeter(int maxTime) {
		this.maxTime = maxTime;
	}
	
	public boolean add(int paramater) {
	if (paramater==25 && timeLeft+30<maxTime) {
		timeLeft+=30;
		return true;
		}
			return false;
	}
	
	public void tick() {
		if (timeLeft>0) {
			timeLeft--;
		}
	}
	
	public boolean isExpired() {
		if (timeLeft==0) {
			return true;
		} 
			return false;
		
	}
	
	
	
	
	
	
	
}
