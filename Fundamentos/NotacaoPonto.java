package Fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Nem Fudendo";
		s = s.replace("Fudendo", "Fudido");
		s = s.concat(" seu arrombado");
		s = s.toUpperCase();		
		
		System.out.println(s);
		
		String y = "Vai toma no cu"
				.replace("cu", "on amot iaV")
				.toUpperCase();
		
		System.out.print(y);
		
		//Tipos primitivos não tem atributos ou comportamentos "."
		
		
	}
}
