package day36_staticClassMembers;

public class Campus {

	private String city;
	static String country;
	
	static {
		
		System.out.println("Static Block-1");
		country="usa";
	}
	public Campus(String city) {
		System.out.println("consructor");
		this.city=city;
	}
	
	static {
		System.out.println("Static Block-2");
		country="uk";
	}
}
