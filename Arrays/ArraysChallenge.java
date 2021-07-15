package Arrays;

import java.util.Scanner;

public class ArraysChallenge {

	public static void main(String[] args) {

		double Total = 0, Notes = 0;
		
		Scanner Enter = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de notas que deseja inserir: ");
		
		double Quanty = Enter.nextDouble();

		double Students[] = new double[(int) Quanty];

		for (int i = 0; i < Students.length; i++) {

			System.out.println("Insira a " + (1 + i) + "º nota: ");
			Students[i] = Enter.nextDouble();
			Notes = i;
		}
		Enter.close();

		for (double EhMoleKKK : Students) {

			Total += EhMoleKKK;
		}
		if (Quanty != 0) {

			System.out.println("Quantidade de notas: " + (1 + (int) Notes) + "\nTotal: " + Total + "\nMédia: "
					+ (Total / Students.length));
		}
	}
}
