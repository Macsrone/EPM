package lekser11;

import java.util.Arrays;

public class Q47 {

	public static void main(String[] args) {

int [] arr= {3, 8, 0, 32, 3, 2, 7, 1};
		
		int sum;
		int day=0;
		do {
			sum=0;
			System.out.print("Day " + day + " ");
			System.out.println(Arrays.toString(arr));
			day++;
			for (int i=0;i< arr.length;i++) {
				sum+=arr[i];
				arr[i]=arr[i]/2;
				
				}
			
		}while (sum!=0);
		
		System.out.println("-----EXTINCT-----");
}}