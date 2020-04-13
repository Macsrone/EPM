package day42_interface;

public interface Electric {

	public static final boolean HAS_BATTTERIES = true;
	
	boolean HAS_BATTERIES2= false;  // public final static
	
	public abstract void charge();
	void charge2();  // public abstract
	
	public default void methodA() { // default method
		
	}
	

	public static void methodB() { // static  method
		
	}
	
	
	
		
	}
