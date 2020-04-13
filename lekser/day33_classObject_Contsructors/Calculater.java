package day33_classObject_Contsructors;

public class Calculater {

	
	Floor floor;
	
	Carpet carpet;
	
	
	public Calculater(Floor floor, Carpet carpet) {
		
		this.floor = floor;
		this.carpet = carpet;
		
		
	}
	
	public double getTotalCost() {
		return floor.getArea() * carpet.getCost(); 
	}

}
