package Control;

public class ChallengeFor {

	public static void main(String[] args) {
		
		//Desafio : Não pode usar valores numéricos dentro do laço
		
		String Cerq;
		
		for(Cerq = "#"; !Cerq.equals("#################"); Cerq+= "#") {
			
			System.out.println(Cerq);
		}
		
	}
}
 