package Treino;

//import java.awt.Color;
import java.util.Scanner;

public class CalculadorSwitch {
	
	public static void main(String[] args) {
		
		double Num, Num2, Result;
		String key;
		
		Scanner Enter = new Scanner(System.in);
		
		do {		
		
		System.out.println("Insira dois valores : ");
		Num = Enter.nextDouble();
		Num2 = Enter.nextDouble();
		
		System.out.println("Agora insira uma opera��o a ser feita ( +, -, *, / )\nOu para sair digite 's': ");
		
		key = Enter.next();
		
		
		switch (key.charAt(0)) {
		
			case '+':
				
					System.out.println("Opera��o inserida \"" + key + "\" com sucesso");
					
					Result = Num + Num2;
					System.out.println("A soma de de " + Num + " " + key + " " + Num2 + " � de = " + Result );
				break;
				
			case '-':
				
					System.out.println("Opera��o inserida \"" + key + "\" com sucesso");
					
					Result = Num - Num2;
					System.out.println("A subtra��o de " + Num + " " + key + " " + Num2 + " � de = " + Result );
				break;
				
			case '*':
				
					System.out.println("Opera��o inserida \"" + key + "\" com sucesso");
					
					Result = Num * Num2;
					System.out.println("A multiplica��o de " + Num + " " + key + " " + Num2 + " � de = " + Result );
				break;
	
			case '/':
					
					System.out.println("Opera��o inserida \"" + key + "\" com sucesso");
					
					Result = Num / Num2;
					System.out.println("A divis�o de " + Num + " " + key + " " + Num2 + " � de = " + Result );
				break;
				
			case 's':
				
				
				break;
			
			default:
				
					System.out.println("Valor inserido n�o correspondente: '" + key + "'");
		}
		
		}while(key.charAt(0) != 's');
		
		System.out.println("\t\t\t  PROGRAMA FINALIZADO");

		Enter.close();
	}
}
