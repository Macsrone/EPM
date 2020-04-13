package lekser12;
import java.util.ArrayList;
import java.util.Arrays;

public class Q66 {

	public static void main(String[] args) {
	
		ArrayList <Integer> Integers = new ArrayList<>( Arrays.asList(1,-2,-3,4,5));

		
		System.out.println(appendPosSum(Integers));
	}

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> integers) {
		ArrayList <Integer> arr = new ArrayList<>();
		for (Integer integer : integers) {
			if (integer>0) {
				arr.add(integer);
			}
			
		}
		int sum=0;
		for (Integer integer : arr) {
			sum+=integer;
		}
		arr.add(sum);
		return arr;
		
		
	}

}
