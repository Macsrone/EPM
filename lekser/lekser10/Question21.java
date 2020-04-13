package lekser10;

public class Question21 {
	
		public static void main(String[] args) {
			 
		
		
		String str="abcYabc";
		int count=3;
		int counter=0;
		for(int i=0;i<str.length()-(count-1);i++) {
			if(str.substring(0, count).equals(str.substring(i,i + count))) {
				counter++;
			}
		}
		
		if(counter==2) {
			System.out.println(true);
			System.out.println(str.substring(0, count) + " appears twice");
		}else if(counter==1) {
			System.out.println(false);
			System.out.println(str.substring(0, count) + " appears only once");
		}
		}
	
	}

	
	

