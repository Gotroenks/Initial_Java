package Control;

public class ForThree {

	public static void main(String[] args) {
		
		int Cont = 0;

		for(int i = 0; i<10; i++) { // V�riavel incializada numa fun��o local
			
			Cont++;
		}
		// System.out.println(i); // V�riavel local n�o pode ser utilizada fora dela
		System.out.println(Cont);
		
	}
}
