package Fundamentos;

import java.util.Scanner;

public class DesafioConversão {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		String a, b, c;
		
		System.out.println("Insira um salário: ");
		a = salario.nextLine().replace(",", ".");
		System.out.println("Insira mais um salário: ");
		b = salario.nextLine().replace(",", ".");
		System.out.println("Insira um último salário: ");
		c = salario.nextLine().replace(",", ".");
		
		double sal1 = Double.parseDouble(a);
		double sal2 = Double.parseDouble(b);
		double sal3 = Double.parseDouble(c);
		
		System.out.println("Os salários foram de " + sal1 + ", " + sal2 + " e " + sal3 + "\n");
		
		System.out.println("E a média deles foi de = " + (sal1 + sal2 + sal3) / 3);
		
		salario.close();
	}
}
