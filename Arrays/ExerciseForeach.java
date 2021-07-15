package Arrays;

import java.util.Scanner;

public class ExerciseForeach {

	public static void main(String[] args) {

		double Note = 0, Note2 = 0;
		double[] StudentNotes = new double[3];
		double[] StudentNotes2 = { 1, 4, 5.5};
		
		Scanner Enter = new Scanner(System.in);

		StudentNotes[0] = Enter.nextDouble();
		StudentNotes[1] = Enter.nextDouble();
		StudentNotes[2] = Enter.nextDouble();
		
		Enter.close();
		
		for (double Student : StudentNotes) {
			
			Note += Student;
		}

		 System.out.println(Note / StudentNotes.length);


		 for (double Students : StudentNotes2) {
				
				Note2 += Students;
			}
		
		System.out.println(Note2 / StudentNotes.length);

		 
	}
}
