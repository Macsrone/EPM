package day40_accesModifiers_final_hiding;

import java.time.Year;

public class CarTest {

	public static void main(String[] args) {

		Car c= new Car();
		
		c.model="M3";
		c.year= 2017;
		c.engine=2.0;
		
		System.out.println(c.toString());
	}

}
