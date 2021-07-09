package Class;

import java.util.Scanner;

public class ChallengeDateClass {

	public static void main(String[] args) {

		/*
		 * CHALLENGE 1 ChallengeAuxiliaryDateClass Calendar = new
		 * ChallengeAuxiliaryDateClass();
		 * 
		 * Scanner Enter = new Scanner(System.in);
		 * 
		 * System.out.println("Insira uma data válida: "); Calendar.day =
		 * Enter.nextInt(); Calendar.mouth = Enter.nextInt(); Calendar.year =
		 * Enter.nextInt();
		 * 
		 * // Conversão necessaria quando trabalhado com string // int DayDate =
		 * Integer.parseInt(Calendar.day); // int MouthDate =
		 * Integer.parseInt(Calendar.mouth); // int YearDate =
		 * Integer.parseInt(Calendar.year);
		 * 
		 * System.out.println(Calendar.day + "/" + Calendar.mouth + "/" +
		 * Calendar.year);
		 * 
		 * Enter.close();
		 */

		// CHALLENGE 2

		ChallengeAuxiliaryDateClass Date = new ChallengeAuxiliaryDateClass();
		var Date2 = new ChallengeAuxiliaryDateClass();
		
		Scanner Enter = new Scanner(System.in);

		System.out.println("Insira uma data inteira: ");
		Date.day = Enter.nextInt();
		Date.mouth = Enter.nextInt();
		Date.year = Enter.nextInt();

		System.out.println("Data inserida: " + Date.FormatedDate());
		System.out.println("Data inserida: " + Date2.FormatedDate());

		Enter.close();
	}
}
