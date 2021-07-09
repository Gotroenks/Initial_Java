package Fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Test";
		System.out.println(c);
		
		/* Valor var é inferido assim que inserido um valor
		exemplo: var test= "texto"; ->(ERRO) test = 23;  
		*/
	}
}
