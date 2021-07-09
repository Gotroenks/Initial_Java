package Operadores;

public class Logicos {

	public static void main(String[] args) {

		boolean condition1 = true;
		boolean condition2 = 3 > 4;
		
		System.out.println(condition1 && condition2);
		System.out.println(condition1 || condition2);
		System.out.println(condition1 ^ condition2);
		System.out.println(!condition1);
		System.out.println(!condition2);
		System.out.println(!!condition1);
		System.out.println(!!condition2);
		
		System.out.println("Tabela  verdade and (&&)");		
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		System.out.println("Tabela  verdade Or (||)");		
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("Tabela  verdade Xor (^)");		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("Tabela  verdade not (!)");		
		System.out.println(!true);
		System.out.println(!false);
		//System.out.println(!false || !true);
		System.out.println(!false && !false);
	}
}
