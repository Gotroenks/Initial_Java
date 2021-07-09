package Control;

import java.util.Scanner;

public class ChallengeDayWeek {

	public static void main(String[] args) {

		// Domingo -> 1, Segunda -> 2, Terça -> 3, Quarta -> 4
		// Quinta -> 5, Sexta -> 6, Sábado -> 7
		int Day;
		String Leave;

		Scanner Enter = new Scanner(System.in);
		do {
		System.out.println("Insira um número (INTEIRO)\npara converter em um dia da semana: ");
		Day = Enter.nextInt();

		while (Day < 1 || Day > 7) {

			System.out.println("Número inválido: " + Day);
			System.out.println("Insira um número valido de 1 a 7: ");
			Day = Enter.nextInt();
		}

		System.out.println("Número inserido: " + Day);

		if (Day == 1)
			System.out.println("Conversão para: " + Integer.toString(Day).replace("1", "Domingo"));
		if (Day == 2)
			System.out.println("Conversão para: " + Integer.toString(Day).replace("2", "Segunda"));
		if (Day == 3)
			System.out.println("Conversão para: " + Integer.toString(Day).replace("3", "Terça"));
		if (Day == 4)
			System.out.println("Conversão para: " + Integer.toString(Day).replace("4", "Quarta"));
		if (Day == 5)
			System.out.println("Conversão para: " + Integer.toString(Day).replace("5", "Quinta"));
		if (Day == 6)
			System.out.println("Conversão para: " + Integer.toString(Day).replace("6", "Sexta"));
		if (Day == 7)
			System.out.println("Conversão para: " + Integer.toString(Day).replace("7", "Sábado"));
		
		System.out.println("FIM DO PROGRAMA\n Deseja sair do programa ? 's' para sair ");
		Leave = Enter.next();

		}while(Leave.charAt(0) != 's');
		Enter.close();
	}
}
