package lekser11;

import java.util.ArrayList;

public class Q42 {

	public static void main(String[] args) {

				
		String[] arr= {"zero","one","three","lol","cent","london"};
		ArrayList<String> fewValues= new ArrayList<String>();
		
		
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].contains("e")) {
						fewValues.add(arr[i]);
					}
				}
				System.out.println(fewValues);
		
	}

	
	
}
