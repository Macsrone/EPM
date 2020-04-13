package lekser11;

import java.util.*;

public class Q50 {

	public static void main(String[] args) {

		ArrayList<Integer> inputArray = new ArrayList<Integer>(Arrays.asList(2,3,4,9));
		int newLength= inputArray.size()*2;
		ArrayList<Integer> doubleZero = new ArrayList<Integer>();		
		for (int i = 1; i <newLength; i++) {
			doubleZero.add(0);
		}
		doubleZero.add(inputArray.get(inputArray.size()-1));
		System.out.println(doubleZero);	
	}
}
