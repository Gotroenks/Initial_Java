package Control;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner Enter = new Scanner(System.in);

		String Leave;

		System.out.println("Deseja sair do programa ? 'SAIR' para sair");
		do { // Incio do laço
			
			Leave = Enter.next();
			System.out.println("Você digitou: " + Leave);
			
		} while (!Leave.equalsIgnoreCase("sair")); // condição, tudo que for
		//diferente de "sair", irá entrar em loop.

		Enter.close();
	}
}
