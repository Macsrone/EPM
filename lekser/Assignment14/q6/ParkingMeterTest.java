package Assignment14.q6;

public class ParkingMeterTest {

	public static void main(String[] args) {

		ParkingMeter parkingMeter= new ParkingMeter(100);
		parkingMeter.add(25);
		
		parkingMeter.tick();
		System.out.println(parkingMeter.timeLeft);
		parkingMeter.timeLeft=0;
		System.out.println(	parkingMeter.isExpired());
	}

}
