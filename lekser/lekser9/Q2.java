package lekser9;
import java.util.*;
public class Q2 {	
		static Scanner sc=new Scanner(System.in);
		
		static double laptopPrice=0;

		public static void main(String[] args) {
			
			screenSize();
			cpuType();
			ramSize();
			memorySize();
			screenRes();
			
			System.out.println("Laptop price for your specific selections: $" + laptopPrice);

		}

		public static double screenSize() {
			
			int scrPrice=0;
			
			System.out.println("Select screen size(13,3 - 15,0 - 17,3): ");
			
			double scr=sc.nextDouble();
			
			if(scr==13.3) {
				scrPrice=200;
			}else if(scr==15.0) {
				scrPrice=300;
			}else if(scr==17.3) {
				scrPrice=400;
			}else {
				System.out.println("Invalid input");
			}
			
			laptopPrice+=scrPrice;
			
			return scr;
	}
		public static String cpuType() {
			
			int cpuPrice=0;
			
			System.out.println("Select CPU type(i3, i5, i7): ");
			
			String str=sc.next();
			
			if(str.equalsIgnoreCase("i3")) {
				cpuPrice=150;
			}else if(str.equalsIgnoreCase("i5")) {
				cpuPrice=250;
			}else if(str.equalsIgnoreCase("i7")) {
				cpuPrice=350;
			}else {
				System.out.println("Invalid input");
			}
			
			laptopPrice+=cpuPrice;
			
			return str;
		}
		
		public static int ramSize() {
			
			int ramPrice=0;
			int ramPrice_4GB=50;
			System.out.println("Select ram size (4GB*): ");
			
			int ramSize=sc.nextInt();
			
			if(ramSize%4==0) {
				ramPrice=(ramSize/4)*ramPrice_4GB;
			}else {
				System.out.println("Please enter multiply of 4GB as ram size!");
			}
			laptopPrice+=ramPrice;
			
			return ramPrice;
		}
		
		public static String storageType() {
			
			System.out.println("Select storage type(SSD/HDD): ");
			
			String sType=sc.next();
			
			return sType;
		}
		
		public static int memorySize() {
			
			System.out.println("Enter memory size(multiply of 500GB): ");
			
			int mSize=sc.nextInt();
			
			if(storageType().equalsIgnoreCase("SSD")) {
				laptopPrice+=(mSize/500)*100;
			}else if (storageType().equalsIgnoreCase("HDD")) {
				laptopPrice+=(mSize/500)*50;
			}else {
				System.out.println("Please choose memory size multiply of 500GB!");
			}
			
			return mSize;
		}
		public static String screenRes() {
			
			System.out.println("Enter screen resolution(FULLHD/4K): ");
			
			String sRes=sc.next();
			
			if(sRes.equalsIgnoreCase("FULLHD")) {
				laptopPrice+=100;
			}else if(sRes.equalsIgnoreCase("4K")) {
				laptopPrice+=200;
			}else {
				System.out.println("Your need to choose FULLHD or 4K as input!");
			}
			
			
			return sRes;
		}}