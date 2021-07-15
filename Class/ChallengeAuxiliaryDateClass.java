package Class;

public class ChallengeAuxiliaryDateClass {

	int day, mouth, year;

	String FormatedDate() {
				
		return String.format("%d/%d/%d", day, mouth, year);
	}
	
	ChallengeAuxiliaryDateClass(Integer day, Integer mouth, Integer year){
		
		// this usado para referir-se a inst�ncia (objeto) "day" 
		
		this.day = day; 
		this.mouth = mouth;
		this.year = year;
		
		//TIPOS PRIMITIVOS INICIALIZADOS COMO LOCAL N PODEM SER IMPRIMIDOS SEM 
		//ANTES DECLARADOS. ESTES TIPOS DECLARADOS NA CLASSE PODEM SER 
		//IMPRIMIDOS COMO PADR�O (Valores num�ricos inicializar�o com 0)
		
		//Objetos ter�o valores null como padr�o, exemplo: String s = null;
	}
	
	ChallengeAuxiliaryDateClass(){
		
		day = 1;
		mouth = 1;
		year = 1970;
	}
}
