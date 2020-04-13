package lekser12;

import java.util.*;

public class Q67 {

	public static void main(String[] args) {
	
		ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));

		System.out.println((timesTwo(nums)));
	}

	public static ArrayList<Integer>  timesTwo(ArrayList<Integer> nums) {
		
		for (int i = 0; i < nums.size(); i++) {
			nums.set(i, 2*nums.get(i));
		}
		return nums;
		
		
	}

}
