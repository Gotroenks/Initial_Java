package Collections;

import java.util.HashSet;
import java.util.Set;

public class MessySet {

	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static void main(String[] args) {
		
		HashSet Set = new HashSet();
		
		// N�o aceita tipos primitivos, convers�o no momento de inser��o
		Set.add(1.5); // double -> Double
		Set.add(true); // boolean -> Boolean
		Set.add("Test"); // String
		Set.add(1); // int -> Integer
		Set.add('A'); // char -> Character
		
		System.out.println("Tamanho do conjunto: " + Set.size());
		
		/*
		 * Set.add("Test");
		System.out.println("Novo tamanho do conjunto: " + Set.size());
		Ao inserir um valor repetido o tamanho do conjunto n�o muda, � apenas
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
		//Fun��o contains -> verifica se o valor est� contido ou n�o no conjunto
		
		Set Num = new HashSet();
		
		Num.add(1);
		Num.add(2);
		Num.add(3);
		
		System.out.println(Num);
		System.out.println(Set);
		
		//Set.addAll(Num); // addAll -> Uni�o entres dois conjuntos 
		Set.retainAll(Num); // retainAll -> Uni�o, onde pega apenas os valores 
							// contidos
		System.out.println(Set);
		
		Set.clear();
		System.out.println(Set);
	}
}
