package Control;

import java.util.Scanner;

public class ChallengeWhile {

	public static void main(String[] args) {
		
		
		double Note, Total = 0;
		int Quanty = 1;
		
		System.out.println("Insira uma nota (v�lida) ou digite -1 para sair: ");
		Scanner Enter = new Scanner(System.in);
		
		Note = Enter.nextDouble();	// Entrada de dados double pelo usu�rio 
		if(Note >= 0 && Note < 11) { // Se a nota for v�lida, adentra � condi��o
			
			while(!(Note == -1)) { // Loop at� ser digitado -1
				
				Total += Note;
			
				System.out.println("Insira mais uma nota (v�lida) ou digite -1 para sair: ");
				Note = Enter.nextDouble();
				
				if(Note == -1) break;// condi��o quando verdadeira for�ar� um break, sair� do loop
				Quanty++; // Incremento para acompanhar quantidade de dados inseridos		
			}
			
			System.out.println("Total de nota: " + Total + "\nQuantidade de notas digitas: " + Quanty + "\nM�dia: " + Total/Quanty);
		}
			
		Enter.close();
	}
}
