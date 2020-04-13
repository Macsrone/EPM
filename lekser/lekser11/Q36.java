package lekser11;

import java.util.*;


public class Q36 {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,5,6));

		boolean flag=false;
		for (int i = 0; i < nums.size(); i++) {
			
			if(nums.get(i)==5 && nums.get(i+1)==5) {
				
				flag=true;
				break;
			} 
		}
			System.out.println(flag);
			
			
			
			}
		
	}	
	
