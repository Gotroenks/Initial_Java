package Fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		int result;
		
		System.out.print("Big beijo");
		
		//int a = 3;
		Scanner enter = new Scanner(System.in); // função de entrada (o scanf do C)
		
		System.out.print("\nDigite um nome: ");
		String nome = enter.nextLine();
		
		System.out.print("\nDigite um sobrenome: ");
		String sobrenome = enter.nextLine();

		System.out.print("\nDigite uma idade: ");
		int idade = enter.nextInt();
		
		System.out.println("Nome digitado = " + nome + " " + sobrenome + "\nIdade: " + idade);
		
		
		Scanner Inteiro = new Scanner(System.in);
		
		System.out.println("Insira um valor para somarmos: ");
		int a = Inteiro.nextInt();
		System.out.println("Insira mais um valor para somarmos: ");
		int b = Inteiro.nextInt();
		
		result = a + b;
		
		System.out.println("O valor da soma foi de = " + result);
		enter.close();
		Inteiro.close();
	}
}
