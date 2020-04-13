package Assignment14.q8;

public class ValueTest {

	public static void main(String[] args) {

		Value v=new Value();
		System.out.println(v.getVal());
		v.setVal(5);
		System.out.println(v.getVal());
		v=new Value(15);
		System.out.println(v.getVal());
	}

}
