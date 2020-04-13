package day40_accesModifiers_final_hiding2;


public class FinalMethods {

	public final void method1() {
		System.out.println("method-1");
	}
	
	public static void staticMethod(String word) {
		System.out.println("Static Method");
	}
	
}

class Sub extends FinalMethods{
	/* @Override
	 * Final methods can not be overrided.
	public void method1() {
		System.out.println("Method-1 in sub class");
	}
	*/
	
	public static void staticMethod(String word) {
		System.out.println("Static Method in sub class");
	}
	
	
}
