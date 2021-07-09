package Control;

import java.util.Scanner;

public class SwitchWithBreak {


	public static void main(String[] args) {
		
		String Concept = null;
		int Nota;
		
		Scanner Enter = new Scanner(System.in);

		System.out.println("Insira um nota: ");
		Nota = Enter.nextInt();
		
		switch (Nota) {
		
		case 10: case 9:
				Concept = "A";
			break;
		
		case 8: case 7:
			Concept = "B";
			break;
			
		case 6:
			Concept = "C";
			break;

		default:
			System.out.println("Nota não registrada.");
			break;
		}
		System.out.println("Nota: " + Nota + "\nConceito: " + Concept);

		Enter.close();
	}
}
