package lekser13;

import java.util.*;

public class Q72 {

	

		public static void main(String[] args) {
			ArrayList<Integer> units = new ArrayList<>(Arrays.asList(100,200,10));

			System.out.println(refuel_times(units,10));
		}

		public static int refuel_times(ArrayList<Integer> units, int i) {
			
			float stop =0.0f;
			for (Integer integer : units) {
				stop+=integer;
			}
			return  (int) Math.ceil(stop/ i);
		}

	}
