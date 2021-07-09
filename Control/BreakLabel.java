package Control;

public class BreakLabel {

	public static void main(String[] args) {
		
		//Break Label -> Rotulamos algum laço e indicamos ao break
		//Exemplo: 
		First_Loop: for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				if(i == 1) break First_Loop;
				
				System.out.println(i + " " + j);
			}
			System.out.println();
		}		
	}
}
