package day33_classObject_Contsructors;

public class CarpetTest {

	public static void main(String[] args) {
		/*
		Floor f1=new Floor(10, 12);
		Carpet c1=new Carpet(8);
		Calculater cal= new Calculater(f1, c1);
		*/
	 	Calculater cal= new Calculater(new Floor(10,12), new Carpet(8));  // different way
		
		
		double cost= cal.getTotalCost();
		System.out.println(cost);
		
		
	}

}
