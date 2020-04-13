package lekser12;
import java.util.*;
public class Q63 {

	public static void main(String[] args) {

		ArrayList <Double> Doubles = new ArrayList<>( Arrays.asList(0d,2d,4d,6d,8d));


		
		System.out.println("final list=> "+(doubles(Doubles)) );
	}

	public static ArrayList<Double> doubles(ArrayList<Double> Doubles) {
		// TODO Auto-generated method stub

		Doubles.remove(0);
		Doubles.remove(0);
		return Doubles;
	}

}
