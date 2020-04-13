package day33_classObject_Contsructors;

public class Student {
	
	String name;
	int age;
	char gender;
	int year;
	String course;
	String universty = "Cybertek";
	
	
	
	public Student(String name, int age, char gender, int year, String course) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	}

	public void attendLecture() {
		System.out.println(name + " is attending lecture");
	}
	public void attendlabe() {
		System.out.println(name + " is attending labe");
	}
	public void submitAssignment() {
		System.out.println(name + " is attending assingment");
	}
	
}
