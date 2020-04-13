package day36_staticClassMembers;

public class CampusTest {

	public static void main(String[] args) {

		
		Campus c1 = new Campus("istanbul");
		Campus c2 = new Campus("london");

		System.out.println(Campus.country);
		
	}

}