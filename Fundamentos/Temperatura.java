package Fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// (�F - 32) x 5/9 = �C
		final double TempF = 5.0/9;
		final double TempC = 32;
		double Fahrenheit = 50, result;
		
		result = (Fahrenheit - TempC) * TempF;
		
		System.out.println("\nO valor convertido para Celsius foi de = " + result + "C�");
		 
		
		
	}
}
