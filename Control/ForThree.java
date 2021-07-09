package Control;

public class ForThree {

	public static void main(String[] args) {
		
		int Cont = 0;

		for(int i = 0; i<10; i++) { // Váriavel incializada numa função local
			
			Cont++;
		}
		// System.out.println(i); // Váriavel local não pode ser utilizada fora dela
		System.out.println(Cont);
		
	}
}
