package day36_staticClassMembers;

public class Student {

	String name;
	int age;
	int idNumber;  //Belongs to object
	static String school="Cybertek"; //belongs to class
	public Student(String name, int age, int idNumber) {
		super();
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", school=" + school + "]";
	}
	
	
	
}
