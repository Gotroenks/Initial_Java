package Control;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Insira um numero (INTEIRO): ");
		int i = 1, inteiro = enter.nextInt();
		
		//Loop, at� que o usu�rio digite um n�mero maior ou igual a 25, ele n�o
		//vai sair do loop
		while(inteiro < 25) {
			
			System.out.println("N�mero inv�lido\n\nInsira um numero (INTEIRO): ");
			inteiro = enter.nextInt();
			++i;
		}
		
		System.out.println("\t\tFIM DO PROGRAMA");
		System.out.println("Quantas vezes executado fun��o de entrada: " + i);
		
		enter.close();
	}
}
