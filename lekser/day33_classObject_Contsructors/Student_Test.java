package day33_classObject_Contsructors;


public class Student_Test {

	public static void main(String[] args) {

		Student s1= new Student("Mike", 17, 'M', 2016, "Java");
		Student s2= new Student("Smith", 18, 'M', 2017, "Selenium");
				
		
		System.out.println(s1.gender);
		System.out.println(s2.name);
		System.out.println(s1.universty);
		s1.attendLecture();
		s1.attendlabe();
		s1.submitAssignment();

		
		
		
	}

}
