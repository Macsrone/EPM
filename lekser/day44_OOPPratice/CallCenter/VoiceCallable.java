package day44_OOPPratice.CallCenter;

public interface VoiceCallable {

	public static final boolean CAN_CALL= false ;
	
	//abstract method
	void call(String contact);
	//static method
	public static void decline() {
		System.out.println("voice callable - decline()");
	}
	//default method
	public default void accept() {
		System.out.println("voice callable - accept()");
		
		
		
		
	}
}
