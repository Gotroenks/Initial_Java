package Control;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.print("Insira a m�dia: ");
		double Med = enter.nextDouble();
		
		if(Med >= 7) { // se a condi��o for verdadeira, Aluno aprovado
			
			System.out.println("Aluno aprovado");
		}
		else { // se n�o, Aluno reprovado
			
			System.out.println("Aluno reprovado");
		}
		
		enter.close();
	}
}
