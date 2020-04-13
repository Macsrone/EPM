package lekser12;

import java.util.ArrayList;

public class Q60 {

	public static void main(String[] args) {	
		String[] arr1 = { "f","o","o"};
		String[] arr2 = {" b","a","r"};
		for (String string : arr1) {
			System.out.print(string);
		}
		for (String string2 : arr2) {
			System.out.print(string2);
		}
	}
	public static ArrayList<String>  mergR (String[] arr1,String[] arr2) {
		ArrayList <String>  merge = new ArrayList<String> () ;
		
		for (int i = 0; i < arr1.length; i++) {
			merge.add(arr1 [i]);
		}
		for (int i = 0; i < arr2.length; i++) {
		
			merge.add(arr2 [i]);
		}
		return merge;
	}

}


