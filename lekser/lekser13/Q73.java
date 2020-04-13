package lekser13;

public class Q73 {


		public static void main(String[] args) {
			String [][] money = {
					{"drachma","11.0"},
					{"sek","5.0"},					
				};
		
		String [][] convertionRate = {
					{"drachma","0.6"},
					{"sek","100"},									
				};
		
		System.out.println(convertC(money, convertionRate));
		}	

	public static double convertC (String [][] amount, String [][] rate) {
		
		double total=0;
		
		for (int i = 0 ; i<amount.length; i++) {
			
			total += Double.valueOf(amount[i][1])*Double.valueOf(rate[i][1]);
			
		}		
		return total;
	}


		}


