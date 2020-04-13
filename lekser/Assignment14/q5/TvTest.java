package Assignment14.q5;

public class TvTest {

	public static void main(String[] args) {

		TV lg = new TV();
		lg.turnOn();
		lg.setChannel(12);
		System.out.println("channel: "+lg.getChannel());
		
		lg.turnOff();
		System.out.println(lg.isOn());
		
		
	}

}
