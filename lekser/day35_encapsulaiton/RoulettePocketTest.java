package day35_encapsulaiton;

import java.util.Scanner;

public class RoulettePocketTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a pocket number:");
		
		
		RuolettePocket Roulet = new RuolettePocket(sc.nextInt());
		
		while(Roulet.getPocketColor().equalsIgnoreCase("invalid")) {
			System.out.println("Enter a pocket number:");
			Roulet.setPocketNumber(sc.nextInt());
		
		}

		System.out.println(Roulet.getPocketColor());
	}
}