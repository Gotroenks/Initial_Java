package Fundamentos;

import java.util.Scanner;

public class DesafioConvers�o {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		String a, b, c;
		
		System.out.println("Insira um sal�rio: ");
		a = salario.nextLine().replace(",", ".");
		System.out.println("Insira mais um sal�rio: ");
		b = salario.nextLine().replace(",", ".");
		System.out.println("Insira um �ltimo sal�rio: ");
		c = salario.nextLine().replace(",", ".");
		
		double sal1 = Double.parseDouble(a);
		double sal2 = Double.parseDouble(b);
		double sal3 = Double.parseDouble(c);
		
		System.out.println("Os sal�rios foram de " + sal1 + ", " + sal2 + " e " + sal3 + "\n");
		
		System.out.println("E a m�dia deles foi de = " + (sal1 + sal2 + sal3) / 3);
		
		salario.close();
	}
}
