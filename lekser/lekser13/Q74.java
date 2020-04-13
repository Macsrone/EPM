package lekser13;

import java.util.ArrayList;
import java.util.Arrays;

public class Q74 {

	public static void main(String[] args) {
		ArrayList<Integer>	nums=new ArrayList<>(Arrays.asList(1,1,2,3,1,4));
				Integer num=1;
				
				System.out.println(removeInst(nums,num));
				
				
			}
public static ArrayList<Integer> removeInst(ArrayList<Integer> nums, Integer num) {
	
		while(nums.contains(num)) {
		
			nums.remove(num);
		}
		return nums;
	}

	}


