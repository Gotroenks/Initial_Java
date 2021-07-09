package Fundamentos;


import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
	
		//Ler num1
		//Ler num2
		// + - * / %
		
		String a, b, Oper;
		
		Scanner Valor = new Scanner(System.in);
		
		System.out.println("-----------CALCULADORA-----------");
		
		System.out.print("Insira um número: ");
		a = Valor.next();
		
		System.out.print("Agora insira um novo valor: ");
		b = Valor.next();
		
		double num1 = Double.parseDouble(a);
		double num2 = Double.parseDouble(b);
		
		System.out.print("E por último insira a operação que deseja realizar ( + , - , * or / ): ");		
		
		Oper = Valor.next(); 
			
		double result = "+".equals(Oper) ? num1 + num2 : 0;
		result = "-".equals(Oper) ? num1 - num2 : result;
		result = "*".equals(Oper) ? num1 * num2 : result;
		result = "/".equals(Oper) ? num1 / num2 : result;
		result = "%".equals(Oper) ? num1 % num2 : result;
	
		System.out.printf("\nO valor da conta de %.2f %s %.2f é de = %.2f", num1, Oper, num2, result);
		
		Valor.close();
	}

}
