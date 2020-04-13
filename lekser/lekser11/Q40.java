package lekser11;

public class Q40 {

	public static void main(String[] args) {

		
		String [] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
				int largest=words[0].length();
				String big="";
				for(int i=0;i<words.length;i++) {
					if(words[i].length()>largest) {
						largest=words[i].length();
						big=words[i];
					}
				}
				System.out.println(big);
	}
}