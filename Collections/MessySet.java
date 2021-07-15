package Collections;

import java.util.HashSet;
import java.util.Set;

public class MessySet {

	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static void main(String[] args) {
		
		HashSet Set = new HashSet();
		
		// Não aceita tipos primitivos, conversão no momento de inserção
		Set.add(1.5); // double -> Double
		Set.add(true); // boolean -> Boolean
		Set.add("Test"); // String
		Set.add(1); // int -> Integer
		Set.add('A'); // char -> Character
		
		System.out.println("Tamanho do conjunto: " + Set.size());
		
		/*
		 * Set.add("Test");
		System.out.println("Novo tamanho do conjunto: " + Set.size());
		Ao inserir um valor repetido o tamanho do conjunto não muda, é apenas
		ignorado
		*/
		
		Set.add("test");
		System.out.println("Novo tamanho do conjunto: " + Set.size());
		
		System.out.println(Set.remove("Teste"));
		System.out.println(Set.remove("Test"));

		System.out.println("Novo tamanho do conjunto: " + Set.size());
		
		System.out.println(Set.contains("Test"));
		System.out.println(Set.contains(1));
		System.out.println(Set.contains(false));
		//Função contains -> verifica se o valor está contido ou não no conjunto
		
		Set Num = new HashSet();
		
		Num.add(1);
		Num.add(2);
		Num.add(3);
		
		System.out.println(Num);
		System.out.println(Set);
		
		//Set.addAll(Num); // addAll -> União entres dois conjuntos 
		Set.retainAll(Num); // retainAll -> União, onde pega apenas os valores 
							// contidos
		System.out.println(Set);
		
		Set.clear();
		System.out.println(Set);
	}
}
