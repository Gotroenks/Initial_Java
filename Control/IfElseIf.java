package Control;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner enter = new Scanner(System.in);

		System.out.print("Digite a nota: ");
		double Nota = enter.nextDouble();

		if (Nota > 10 || Nota < 0)
			System.out.println("Nota inválida");

		else {
			if (Nota >= 8)
				System.out.println("Nota: " + Nota + ", A");
			if (Nota >= 6 && Nota < 8)
				System.out.println("Nota: " + Nota + ", B+");
			if (Nota >= 5 && Nota < 6)
				System.out.println("Nota: " + Nota + ", C");
			else if(Nota < 5)
				System.out.println("Recuperação, Nota : " + Nota + ", F");
		}

		enter.close();
	}
}
