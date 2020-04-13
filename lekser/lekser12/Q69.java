package lekser12;
import java.util.*;

public class Q69 {
		public static void main(String[] args) {	
			ArrayList <Boolean> example = new ArrayList<>( Arrays.asList(true,false));
			System.out.println(repeatAL(example));
	}

		public static ArrayList<Boolean> repeatAL(ArrayList<Boolean> example) {
			ArrayList <Boolean> again = new ArrayList<>();
			for (Boolean i : example) {
				again.add(i);
			}
			for (Boolean i : example) {
				again.add(i);
			}
			return again;			
		}
	}

