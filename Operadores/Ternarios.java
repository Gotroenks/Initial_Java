package Operadores;


public class Ternarios {

	public static void main(String[] args) {
		
		double Med = 7.5;
		
		String Result = Med >= 7  ? "Aprovado" : "Reprovado";
		
		System.out.println("O aluno está " + Result + ", por nota: " + Med);
		
	}
}
