package day33_classObject_Contsructors;

public class Mouse {

	int numTeeth;
	int numWhiskers;
	int weight;
	//1
	public Mouse(int weigth) {
	
		this(20, weigth);
		this.weight= weigth;
		System.out.println("Java");
	}
	//2
	public Mouse(int numTeeth, int weight) {
		this(numTeeth, 50, weight);
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println("JS");
	}
	//3
	public Mouse(int numTeeth,int numWhiskers,int weight) {
		this.numTeeth= numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("C");
	}
	
	public void print() {
		
		System.out.println(weight + " "+ numTeeth + " " + numWhiskers);
	}
}
