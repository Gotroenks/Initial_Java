package Control;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Insira um numero (INTEIRO): ");
		int i = 1, inteiro = enter.nextInt();
		
		//Loop, até que o usuário digite um número maior ou igual a 25, ele não
		//vai sair do loop
		while(inteiro < 25) {
			
			System.out.println("Número inválido\n\nInsira um numero (INTEIRO): ");
			inteiro = enter.nextInt();
			++i;
		}
		
		System.out.println("\t\tFIM DO PROGRAMA");
		System.out.println("Quantas vezes executado função de entrada: " + i);
		
		enter.close();
	}
}
