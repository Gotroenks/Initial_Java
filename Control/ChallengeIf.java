package Control;

public class ChallengeIf {

	public static void main(String[] args) {
		
		//Desafio: Identificar o erro da condicional ser (na teoria) sempre 
		//verdadeira ou seja, sempre adentrar a condi��o mesmo sendo falsa
		
		double nota = 1.5;
		
		if(nota >= 9); {
			
			System.out.println("Quadro de Honra!");
			System.out.println("Voc� � fera!");
		}
		
		//Resposta: Condi��o IF n�o est� sendo executada por conta do ';', ou seja
		//ele n�o entra na condi��o porque nem existe condi��o pr�ticamente
	}
}
