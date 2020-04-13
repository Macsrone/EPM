package lekser11;

public class Q39 {

	public static void main(String[] args) {

		String email="info@cybertekschool.com";
		
		String[] id=email.split("@", 2);
		
		for (String a : id) {

			if (!email.contains("@")) {
				System.out.println("Invalid mail");
			break;
			}
			System.out.println(a);
		}
		
	}

}
