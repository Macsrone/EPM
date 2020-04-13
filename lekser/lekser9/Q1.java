package lekser9;
import java.util.*;
public class Q1 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Will payment split(True/False): ");
			
			boolean b1=sc.nextBoolean();
			
			System.out.println("Number of people: ");
			
			int i1=sc.nextInt();
			
			System.out.println("Check amount: ");
			
			double d1=sc.nextDouble();
			
			System.out.println("Select service quality: Poor, Fair, Good, Great, Excellent ");
			
			String str=sc.next().toLowerCase();
			
			
			tipCalculator(b1,i1,d1,str);
			
	}
		
		public static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality) {
			
			double payment=totalToPay(checkAmount,tipRate(serviceQuality));
			double tip=tipRate(serviceQuality)*checkAmount;
			double payPerson=perPerson(numberPeople,payment);
			double tipPer=tipPerson(numberPeople,tip);
			System.out.println("Number of people entered: " + numberPeople);
			System.out.println("Total to pay: " + payment);
			System.out.println("Total tip: " + tip);
			if(isSplit) {
			System.out.println("Total per person: " + payPerson);
			System.out.println("Tip per person: " + tipPer);
			}else {
				System.out.println("Total amount you need to pay: " + payPerson);
				System.out.println("Tip you need to pay: " + tipPer);
			}
			
		}
		
		public static double tipPerson(int numP, double tipP) {
			
			double tipPerson=tipP/numP;
			
			return tipPerson;
		}
	

		public static double perPerson(int people, double pay) {
			
			double perPerson=pay/people;
			
			return perPerson;
		}
	
		public static double totalToPay(double checkAmount, Double tipRate) {
			
			double totalToPay=checkAmount+(tipRate*checkAmount);
			
			return totalToPay;
			}
		

		public static Double tipRate(String str) {
			double tipRate=0;
			
			switch(str) {
			case "poor":
				tipRate=0.05;
				break;
			case "fair":
				tipRate=0.10;
				break;
			case "good":
				tipRate=0.15;
				break;
			case "great":
				tipRate=0.20;
				break;
			case "excellent":
				tipRate=0.25;
				break;
				default:
					System.out.println("Invalid input");
					
			}
			
			return tipRate;
			
			
		}
}