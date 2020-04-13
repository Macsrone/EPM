package day37_Inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {

		
		//ask user how many question in the exam
		//ask user hpw many question missed
		//give user lettergrade(A,B,C)
		
		Scanner sc= new Scanner(System.in);
		
		int questions;
		int missed;
		
		System.out.println("How many questions are on the final exam?");
		questions=sc.nextInt();
		
		System.out.println("How many questions did the student exam?");
		missed=sc.nextInt();
		
		FinalExam exam = new FinalExam(questions, missed);
		System.out.println("The grafe for the exam is " + exam.getGrade());
		
			
	}

}
