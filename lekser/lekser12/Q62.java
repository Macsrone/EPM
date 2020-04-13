package lekser12;
import java.util.*;
public class Q62 {

	public static void main(String[] args) {
		ArrayList <Integer> ints = new ArrayList<>( Arrays.asList(1,2,3,4,5));
		ints(ints);
		System.out.println("sum of all the Integers in ints : "+ ints(ints));
	}
	public static int ints(ArrayList<Integer> ints) {
		Integer sum = 0;
		for (Integer i : ints) {
			sum +=i;
		}
		return sum;		
	}

}
