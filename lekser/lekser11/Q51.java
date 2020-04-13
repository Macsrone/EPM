package lekser11;

public class Q51 {

	public static void main(String[] args) {

		int [] outer = {1,2,3,4,5};
		int [] inner = {2,3,4};
		boolean flag=true;
		for (int i = 0; i < inner.length; i++) {
			if (outer[i+1]==inner[i]) {
				flag=true;
			}else {
				flag=false;
			}
		}
		
		System.out.println(flag);
		
	}

}
