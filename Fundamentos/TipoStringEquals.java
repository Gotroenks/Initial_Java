package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		String s1 = new String("2");
		
		System.out.println("2".equals(s1)); // compara��o de string
		
		Scanner enter = new Scanner(System.in);
		
		String s2 = enter.next();
		System.out.println("2" == s2.trim()); // compara��o de string (falha) com fun��o que ignora espa�o
		System.out.println("2".equals(s2.trim())); // compara��o de string com fun��o que ignora espa�o
		
		enter.close();
	}
}
