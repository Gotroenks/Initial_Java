package Control;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.print("Insira a média: ");
		double Med = enter.nextDouble();
		
		if(Med >= 7) { // se a condição for verdadeira, Aluno aprovado
			
			System.out.println("Aluno aprovado");
		}
		else { // se não, Aluno reprovado
			
			System.out.println("Aluno reprovado");
		}
		
		enter.close();
	}
}
