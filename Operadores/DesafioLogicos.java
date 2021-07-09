package Operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		//Trabalho Terça (V ou F) 
		//Trabalho Quinta (V ouF)
		
		boolean Work1 = true;
		boolean Work2 = false;
		
		if((Work1 && Work2) == true) {
		
			System.out.println("Ambos trabalhos concluídos, televisor de 50 polegadas adquirido. ");
			System.out.println("Familia reunida para tomar sorvete");
		}
		
		else if((Work1 ^ Work2) == true) {
			
			System.out.println("Um trabalho concluído, televisor de 32 polegadas adquirido. ");
			System.out.println("Familia reunida para tomar sorvete");
		}
		
		else {
			
			System.out.println("Nenhum Trabalho concluido, nenhum televisor adquirido ");
			System.out.println("Familia não toma sorvete");
		}
	}
}
