package Control;

public class ChallengeIf {

	public static void main(String[] args) {
		
		//Desafio: Identificar o erro da condicional ser (na teoria) sempre 
		//verdadeira ou seja, sempre adentrar a condição mesmo sendo falsa
		
		double nota = 1.5;
		
		if(nota >= 9); {
			
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!");
		}
		
		//Resposta: Condição IF não está sendo executada por conta do ';', ou seja
		//ele não entra na condição porque nem existe condição práticamente
	}
}
