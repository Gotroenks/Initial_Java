package Control;

public class ContinueLabel {

	public static void main(String[] args) {
		
		//Continue Label -> Rotulamos algum laço e indicamos ao continue
		//Exemplo: 
		First_Loop: for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				if(i == 1) continue First_Loop;
				
				System.out.println(i + " " + j);
			}
			System.out.println();
		}		
	}
}
