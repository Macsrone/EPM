package lekser12;

import java.util.Arrays;

public class Q55 {

	public static void main(String[] args) {

		
	String chessBoard [][]= new String[8][8];
	
	String numbers="12345678";
	String letters="abcdefgh";
	
	for (int i = 0; i < chessBoard.length; i++) {
		for (int j = 0; j < chessBoard.length; j++) {
			
			chessBoard[i][j]=""+numbers.charAt(i)+letters.charAt(j);
			
		}
	}
		
		System.out.println(Arrays.deepToString(chessBoard));
	}

	
	
}
