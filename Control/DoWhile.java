package Control;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner Enter = new Scanner(System.in);

		String Leave;

		System.out.println("Deseja sair do programa ? 'SAIR' para sair");
		do { // Incio do la�o
			
			Leave = Enter.next();
			System.out.println("Voc� digitou: " + Leave);
			
		} while (!Leave.equalsIgnoreCase("sair")); // condi��o, tudo que for
		//diferente de "sair", ir� entrar em loop.

		Enter.close();
	}
}
