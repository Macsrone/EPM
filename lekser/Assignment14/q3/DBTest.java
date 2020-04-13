package Assignment14.q3;

public class DBTest {

	public static void main(String[] args) {

		
		DB db = new DB();
		db.insertData("aaa",123);

		System.out.println(db.getData());//aaa
		System.out.println(db.getYint());//123

		db.setData("zzz");
		db.setYint(200);

		System.out.println(db.getData());//zzz
		System.out.println(db.getYint());//200
	}

}
