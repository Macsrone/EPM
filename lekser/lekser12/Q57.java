package lekser12;

public class Q57 {
	public static void main(String[] args) {
		int sum1 =0;
		int sum2 =0;
		int [][] input = {   {6,2,3},
							 {4,5,6},
							 {9,8,9}  };
		for (int i = 0; i < input.length; i++) {
			sum1 += input[i][i];
		}
		int j = input[0].length-1;
		for (int i = 0; i < input.length; i++) {	
			sum2 += input[i][j];
			j--;
		}
		System.out.println(Math.abs(sum1-sum2));
	}

}
