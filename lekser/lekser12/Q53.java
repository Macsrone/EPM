package lekser12;

import java.util.*;


public class Q53 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double judge=7;
		int points=0;
		double sumPoints=0;
		double difficulty;
		double determineMultiply=0.6;
		
		ArrayList<Integer> point= new ArrayList<Integer>();
		
		for (int i = 1; i <=judge; i++) {
			System.out.println("Enter score for judge "+i+":");
			points=sc.nextInt();
			point.add(points);
		}
		System.out.println("Enter difficulty");
		difficulty=sc.nextDouble();
		int smallest=point.get(0);
		for (int i = 0; i <point.size(); i++) {
			if (point.get(i)<smallest) {
				smallest=point.get(i);
			}
		}
		
		int biggest=point.get(0);
		for (int i = 0; i <point.size(); i++) {
			if (point.get(i)>biggest) {
				biggest=point.get(i);
			}
		}
		for (int i = 0;i <point.size();i ++) {
			sumPoints+=point.get(i);
			
		}
		sumPoints= sumPoints - biggest - smallest;
		
		
		
		double total=(sumPoints*determineMultiply)*difficulty;
		
		System.out.printf("Total: %.2f",total);
	}

}
