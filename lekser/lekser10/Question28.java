package lekser10;

public class Question28 {

	public static void main(String[] args) {

		
		System.out.println(clean("alo,ula,aloo", "ula"));
	}

	

	public static String clean(String s1, String s2) {
		
		String result="";
		
		if(s1.indexOf(s2)==0) {
			result=s1.replace(s2, "").trim();
		
		}else{
			result=s1.replace(s1.charAt(s1.indexOf(s2)-1)+s2, "").trim();
		
		}
		return result;
	}
	
}
