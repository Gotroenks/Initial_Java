package Treino;

import java.util.Random;

import java.util.Scanner;

public class ChallengeRandomNumber {

	/*
	 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene
	 * um número aleatório em uma variável. O Jogador tem 10 tentativas para
	 * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
	 * de tentativas restantes, e imprima se o número inserido é maior ou menor do
	 * que o número armazenado.
	 */

	private static void ClearScreen() {

		for (int i = 0; i < 37; i++)
			System.out.println("");
	}

	public static void main(String[] args) {

		Scanner Enter = new Scanner(System.in);
		String Continua;
		do {
			
			int LuckyNum = 0, Attempts = 11, Number = 0;
			
			System.out.println("O computador sorteou um número de 0 a 100\n");

			Random RandomNumb = new Random();
			LuckyNum = RandomNumb.nextInt(101);

			while (true) {
				
				Attempts--;
				if (Attempts == 0) {

					System.err.println("Número de tentativas zerada\nTente novamente");
					break;
				}

				System.err.println("Número de tentativas restante: " + Attempts + "\n\nInsira um número e boa sorte: ");

				Number = Enter.nextInt();

				if (Number < LuckyNum)
					System.out.println("\n\nNÚMERO MENOR\n");

				else if (Number > LuckyNum)
					System.out.println("\n\nNÚMERO MAIOR\n");

				else {

					System.out.println("\n\nParábens, você acertou o número.\n\n");
					break;
				}

			}

			System.out.println("Deseja sair ? '0' para sair ou qualquer tecla para retornar.");
			Continua = Enter.next();
			ClearScreen();

		} while (Continua.equals("0"));

		Enter.close();
	}
}
