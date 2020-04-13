package day35_encapsulaiton;

public class Person {
	//instance variables 
	private String name;
	private int age;     //how i can restrict this access?
	private char gender;
	
	
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age<0) {
			System.out.println("not valid");
		}
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
	
}

// Encapsulation
//Hide the data
//  -- private
//	-- public setter method
//  -- public getter method




