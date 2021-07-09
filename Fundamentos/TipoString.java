package Fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Hello world".charAt(5));
		
		String s = "boa fiote";
		s = s.toUpperCase();

		System.out.println(s.concat(" fala fiotinho")); // concate��o por chamada de fun��o
		System.out.println(s + " oba oba fiote"); // concatena��o manual
		System.out.println(s.startsWith("BOA")); // Compara a 1� string da frase selecionada
		System.out.println(s.startsWith("BoA")); // Compara a 1� string, indifere o m�todo de escrita (mai�scula ou min�scula)
		System.out.println(s.length()); // Tamanho String
		System.out.println(s.endsWith("FIOTE")); // compara a 2� string, indifere o m�todo de escrita (mai�scula ou min�scula)
		System.out.println(s.equals("BOA FIOTE")); // Compara a String inteira e v� se est� igual para retornar valor booleano
		System.out.println(s.equalsIgnoreCase("boa fiote"));// Compara a String inteira e v� se est� igual (ignorando o case, met�do de escrita) para retornar valor booleano
		
		var name = "Predo";
		var sobrenome = "puta";
		var idade = 33;
		var salario = 1000F; // F -> float literal
		
		System.out.println("Nome: " + name + " " + sobrenome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		
		//Printf do mesmo estilo em C
		
		System.out.printf("\n\nNome: %s\nSobrenome: %s\nIdade: %d\nSal�rio: R$%.2f", name, sobrenome, idade, salario);
		
		
	}
}
