package Arrays;

import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {

		int i;
		double Note = 0, Note2 = 0;
		double StudentNotes[] = new double[3];
		double[] StudentNotes2 = { 1, 4, 5.5};

		
		Scanner Enter = new Scanner(System.in);

		StudentNotes[0] = Enter.nextDouble();
		StudentNotes[1] = Enter.nextDouble();
		StudentNotes[2] = Enter.nextDouble();
		Enter.close();
		
		for (i = 0; i < StudentNotes.length; i++) {

			Note += StudentNotes[i];
		}

		 System.out.println(Note / StudentNotes.length);


		for (i = 0; i < StudentNotes2.length; i++) {
			
			Note2 += StudentNotes2[i]; 
		}
		
		System.out.println(Note2 / StudentNotes.length);

		 
	}
}
