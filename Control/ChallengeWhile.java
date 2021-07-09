package Control;

import java.util.Scanner;

public class ChallengeWhile {

	public static void main(String[] args) {
		
		
		double Note, Total = 0;
		int Quanty = 1;
		
		System.out.println("Insira uma nota (válida) ou digite -1 para sair: ");
		Scanner Enter = new Scanner(System.in);
		
		Note = Enter.nextDouble();	// Entrada de dados double pelo usuário 
		if(Note >= 0 && Note < 11) { // Se a nota for válida, adentra à condição
			
			while(!(Note == -1)) { // Loop até ser digitado -1
				
				Total += Note;
			
				System.out.println("Insira mais uma nota (válida) ou digite -1 para sair: ");
				Note = Enter.nextDouble();
				
				if(Note == -1) break;// condição quando verdadeira forçará um break, sairá do loop
				Quanty++; // Incremento para acompanhar quantidade de dados inseridos		
			}
			
			System.out.println("Total de nota: " + Total + "\nQuantidade de notas digitas: " + Quanty + "\nMédia: " + Total/Quanty);
		}
			
		Enter.close();
	}
}
