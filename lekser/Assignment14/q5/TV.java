package Assignment14.q5;


public class TV {

	int channel=1;
	int volumeLevel=1;
	private boolean on = false;
	String brand = "undefined";
	
	public TV() {
		System.out.println("Creating TV object using no arg - constructor");
	}
	
	

	public TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}


	public void channelUp() {
		if (channel>=1 & channel<=119 && isOn()) {
			channel++;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
		
	}
	
	public void channelDown() {
		if (channel>=2 & channel<=120   && isOn()) {
			channel--;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}
	
	public void volumeUp() {
		if (volumeLevel<1 || volumeLevel>6 || !isOn() ) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}else {volumeLevel++;
			}
	}
	
	public void volumeDown() {
		if (volumeLevel<2 || volumeLevel>7 || !isOn() ) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}else {volumeLevel--;
			}
	}
	
	public boolean isOn() {
		if (on) {
			return true;
		}else {
			return false;
		}
	}	
	
	public void turnOn() {
		if (isOn()) {
			System.out.println("TV is already ON");
		}else
		on = true;
	}
	public void turnOff() {
		if (!isOn()) {
			System.out.println("TV is already OFF");
		}else
		on = false;
	}
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		
		if (channel<1 || channel>120 || !isOn()) {
		System.out.println("ERROR: TV is either OFF or invalid Channel");
		}else {
			this.channel = channel;
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if (volumeLevel<1 || volumeLevel>7 || !isOn() ) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}else {
			this.volumeLevel = volumeLevel;
		}		
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	
	
	
	
	
}
