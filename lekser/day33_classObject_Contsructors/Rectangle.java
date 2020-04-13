package day33_classObject_Contsructors;

public class Rectangle {
	//instance variables
	double length;
	double width;
	
	public void getArea() {
		
		System.out.println(length*width);
	}
	
	
	// created a constructor
	// accepts 2 arguments type double
	
	public Rectangle (double a, double b) {
		
		length = a;
		 width = b;
	}

	public Rectangle() {
	
		length=5.2;
		width=7.5;
}


	
}