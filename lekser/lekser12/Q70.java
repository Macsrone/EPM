package lekser12;
import java.util.*;

public class Q70 {
		
		public static void main(String[] args) {

			int arr[] = {2,4,6,8};
			System.out.println(Arrays.toString(do_switch(arr)));
		}

		public static int[] do_switch(int arr[]) {

			int temp=0;
			
			temp = arr[arr.length-1];
			arr[arr.length-1] = arr[0];
			arr[0] = temp;
			
			return arr;			
	}
}
