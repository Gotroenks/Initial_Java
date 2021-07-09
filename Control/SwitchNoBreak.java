package Control;

import java.util.Scanner;

public class SwitchNoBreak {

	public static void main(String[] args) {

		// Um dos poucos exemplos de Switch sem break
		// SE POSSIVEL EVITE USAR ESTE FORMATO!!!
		int Idade;

		Scanner Enter = new Scanner(System.in);

		System.out.println("Insira sua idade: ");
		Idade = Enter.nextInt();

		switch (Idade) {

		case 4:
			System.out.println("\nSabe pensar.");
			
		case 3:
			System.out.println("\nSabe falar.");
		
		case 2:	
			System.out.println("\nSabe andar.");
		
		case 1:
			System.out.println("\nSabe engatinhar.");
			break; // Para o default funcionar
		
		default:
			System.out.println("Não sabe praticamente nada.");
		}

		Enter.close();
	}
}
