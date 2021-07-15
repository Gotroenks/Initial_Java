package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		
		Queue<String> string = new LinkedList<>();
		
		//offer && add -> Ambos adicionam elementos a fila.
		//Diferença -> offer tem valor boolean quando a fila é determinada.
		
		string.add("Pixega");
		string.offer("Pitola"); 
		string.add("Eh mole");
		string.offer("Richter");
		string.add("Richers");
		
		//peek -> retorna null em fila vazia
		//element -> da erro em fila vazia
		System.out.println(string.peek());
		System.out.println(string.element());
		
		//string.size(); -> Tamanho da fila
		//string.clear(); -> Limpar fila
		//string.isEmpty(); -> Verifica se fila está vazia *(PARA VALIDAÇÃO)*
		//string.contains(String); -> Verifica se está contida ou não

		
		System.out.println("\n\nPega o primeiro elemento da fila e da 'next': ");
		System.out.println(string.poll());
		System.out.println(string.poll());
		System.out.println(string.poll());
		System.out.println(string.poll());
		System.out.println(string.poll());
		//Se a fila estiver vazia, poll retornará null
		
	}
}
