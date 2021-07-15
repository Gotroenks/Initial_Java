package Arrays;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		double Total = 0;
		
		Scanner Enter = new Scanner(System.in);

		System.out.println("Quantos alunos existem? ");
		int NumberStd = Enter.nextInt();
		
		System.out.println("Insira quantas notas por aluno? ");
		int NumberNotes = Enter.nextInt();

		double[][] NoteClass = new double[NumberStd][NumberNotes];
		//Cria��o do objeto array matriz com 2 dimens�es
		
		for (int i = 0; i < NoteClass.length; i++) {
			//1� FOR -> Enquanto a quanidade de alunos for inferior a quantidade
			//inserida pelo usu�rio.
			for (int j = 0; j < NoteClass[i].length; j++) {
				//2�FOR -> Enquanto a quantidade de notas for inferior a
				//quantidade de alunos inserido pelo usu�rio.
				System.out.println("Insira uma nota para o " + (1 + i) + "� aluno:");
				NoteClass[i][j] = Enter.nextDouble();
				
				Total += NoteClass[i][j]; //Incrementa toda vez que loopar.
			}
		}
		
		System.out.println("M�dia final: " + (Total/(NumberNotes * NumberStd)));
		//M�dia em matriz, numero de notas vezes alunos.
		Enter.close();
	}
}
