package day35_encapsulaiton;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee("Mark Jones", 39911);
		Employee e3 = new Employee("Tedd", 832321, "sales", "sales person");
		
		System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());
		System.out.println(e2.getName() + "|" + e2.getIdNumber() + "|" + e2.getDepartment() + "|" + e2.getPosition());
		System.out.println(e3.getName() + "|" + e3.getIdNumber() + "|" + e3.getDepartment() + "|" + e3.getPosition());

		e1.setName("turab");
		e1.setIdNumber(1881);
		e1.setDepartment("Consumer Service");
		e1.setPosition("V.I.P");
		System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());

		System.out.println(e1.toString());
		
		
	}

}
