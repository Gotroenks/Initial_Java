package Control;

public class ForOne {

	public static void main(String[] args) {
		
		int cont;
		
		//Laço for, mais recomendado para loop determinado
		for(cont = 0; cont < 10; cont++) {
			
			System.out.println("Contagem atual: " + cont);	
		}
		
		//laço infinito, sem condição ou seja sempre verdadeira
		//Retirando todos os argumentos também fica em loop infinito: for(;;)
		for(cont = 0;; cont++) {
			
			System.out.println("Contagem atual: " + cont);
		}
	}
}
