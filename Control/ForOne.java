package Control;

public class ForOne {

	public static void main(String[] args) {
		
		int cont;
		
		//La�o for, mais recomendado para loop determinado
		for(cont = 0; cont < 10; cont++) {
			
			System.out.println("Contagem atual: " + cont);	
		}
		
		//la�o infinito, sem condi��o ou seja sempre verdadeira
		//Retirando todos os argumentos tamb�m fica em loop infinito: for(;;)
		for(cont = 0;; cont++) {
			
			System.out.println("Contagem atual: " + cont);
		}
	}
}
