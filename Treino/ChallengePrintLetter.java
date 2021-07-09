package Treino;

import java.util.Scanner;

public class ChallengePrintLetter {

	public static void main(String[] args) {
		
		String Letter;
		
		Scanner Enter = new Scanner(System.in);
		
		System.out.println("Insira uma palavra: ");
		Letter = Enter.next();
		
		//int Lim = Letter.length(); // Converte tamanho da string em um inteiro 
		
		for(int i= 0; i < Letter.length(); i++) {
			
			//Imprime um caracter por vez até o i ser maior q o Lim/Letter.lenght()
			System.out.println(Letter.charAt(i)); 
		}
		
		Enter.close();
	}
}
