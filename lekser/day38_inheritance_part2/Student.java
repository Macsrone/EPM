package day38_inheritance_part2;

public class Student extends Person{

	public void message() {
	System.out.println("this is student class");
	}
	
	public void display() {
	message();
	super.message();
	}
	
}
