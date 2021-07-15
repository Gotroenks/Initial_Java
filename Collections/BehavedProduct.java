package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BehavedProduct {

	public static void main(String[] args) {
		
		//Set<String> List = new HashSet<String>();
		Set<String> List = new TreeSet<>(); // garante ordem de inserção
		
		List.add("1");
		List.add("2");
		List.add("3");
		List.add("4");
		
		for (String string : List) {
			
			System.out.println(string);
		}
		
		System.out.println("\n");
		
		Set<Character> Letters = new HashSet<>(); 
		
		Letters.add('x');
		Letters.add('y');
		Letters.add('z');
		Letters.add('a');

		for (char Letter : Letters) {
			//Set(Hash) -> não respeita ordem de inserção
			System.out.println(Letter);
		}
	}
}
