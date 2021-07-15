package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

	public static void main(String[] args) {
		
		Deque<String> Books = new ArrayDeque<>();
		
		Books.add("Marx");
		Books.push("DeMolay");
		Books.push("Física quântica");
		
		System.out.println(Books.peek());
		System.out.println(Books.element());
		System.out.println(Books.poll());
		System.out.println(Books.remove());
		System.out.println(Books.poll());
		System.out.println(Books.poll());
		System.out.println(Books.poll());
		
		//Books.size();
		//Books.clear();
		//Books.contains();
		//Books.isEmpty();
		
		
		System.out.println("\n\n\n");
		
		for (String book : Books) {
			
			System.out.println(book);
		}
		
		
	}
}
