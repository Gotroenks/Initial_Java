package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		String s1 = new String("2");
		
		System.out.println("2".equals(s1)); // comparação de string
		
		Scanner enter = new Scanner(System.in);
		
		String s2 = enter.next();
		System.out.println("2" == s2.trim()); // comparação de string (falha) com função que ignora espaço
		System.out.println("2".equals(s2.trim())); // comparação de string com função que ignora espaço
		
		enter.close();
	}
}
