package Operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
	/*	int a = 2 + 3 * 4;
		int b = (int) Math.pow(a, 3);
		
		System.out.println(b);*/
		
		double a = 6 * (3 + 2);
		double b = (1 - 5) * (2 - 7);
		
		a = Math.pow(a, 2);
		a /= 3 * 2; 
		b = Math.pow(b, 2); 
		b /= Math.pow(2,2);	
		
		double result = Math.pow(a - b, 3);
		result /= Math.pow(10, 3);
		
		System.out.println(result);
	}
}
