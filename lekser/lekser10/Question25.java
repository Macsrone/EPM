package lekser10;

public class Question25 {

	public static void main(String[] args) {

		
		mergeString("fenerium", "123456");
		
	}

	public static void mergeString(String merge1, String merge2) {
		
			
	
		if (merge1.length()>=merge2.length()) {
			
		
		for (int i = 0; i <merge2.length(); i++) {
			System.out.print(merge1.substring(i,i+1));
			System.out.print(merge2.substring(i, i+1));
			}
		System.out.println(merge1.substring(merge2.length()));

		}else if (merge2.length()>merge1.length()) {
			for (int i = 0; i <merge1.length(); i++) {
				System.out.print(merge1.substring(i,i+1));
				System.out.print(merge2.substring(i, i+1));
			}
			System.out.println(merge2.substring(merge1.length()));

		}
		
	}
	
	
}
