package Operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(3 > 5);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(25 <= 12);
		System.out.println(27 != 28);
		
		System.out.println("\n\n\n");
		
		double nota = 7.3;
		boolean Comport = true;
		boolean Media = nota >= 7;
		
		boolean Desconto = Comport && Media;
		
		System.out.println("Tem desconto ?\n" + Desconto);
		System.out.println("Media maior que 7 ?\n" + Media);
	}
}
