package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//Informações do funcionario
		
		//Tipos numéricos inteiros
		byte AnosDeEmpresa = 23;
		short NumeroDeVoos = 542;
		int id = 56789;
		long PontosAcumulados = 3_134_845_223L; // L -> Literal long
			
		//Tipos numéricos reais
		float Salario = 11_445.99F; // F -> Literal float 
		double  VendasAcumuladas = 2_991_797_103.99;
		
		//Tipos booleano
		boolean EstaDeFerias = false;
		
		//Tipo carctere 
		char Status = '\u0100'; // contra-barra u -> Tabela unicode tranforma binário em um caracter
		
		//Dias de empresa
		System.out.println(AnosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(NumeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(PontosAcumulados / VendasAcumuladas );
		
		System.out.println(id + ": ganha ->" + Salario);
		System.out.println("Férias ? " + EstaDeFerias);
		System.out.println("Status: " + Status);
		System.out.println();
		
	}
}
