package Operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		//Trabalho Ter�a (V ou F) 
		//Trabalho Quinta (V ouF)
		
		boolean Work1 = true;
		boolean Work2 = false;
		
		if((Work1 && Work2) == true) {
		
			System.out.println("Ambos trabalhos conclu�dos, televisor de 50 polegadas adquirido. ");
			System.out.println("Familia reunida para tomar sorvete");
		}
		
		else if((Work1 ^ Work2) == true) {
			
			System.out.println("Um trabalho conclu�do, televisor de 32 polegadas adquirido. ");
			System.out.println("Familia reunida para tomar sorvete");
		}
		
		else {
			
			System.out.println("Nenhum Trabalho concluido, nenhum televisor adquirido ");
			System.out.println("Familia n�o toma sorvete");
		}
	}
}
