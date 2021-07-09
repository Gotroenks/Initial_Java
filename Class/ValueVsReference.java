package Class;

public class ValueVsReference {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // Atribuição por valor (primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		ChallengeAuxiliaryDateClass d1 = new ChallengeAuxiliaryDateClass(15, 05, 2000);
		ChallengeAuxiliaryDateClass d2 = new ChallengeAuxiliaryDateClass();// Atribuição por referencia (objeto)
		
		d1.day = 31;
		d2.mouth = 1;
		
		System.out.println(d1.FormatedDate());
		System.out.println(d2.FormatedDate());
		
		BackDateForDefaultValue(d2);

		System.out.println(d1.FormatedDate());
		System.out.println(d2.FormatedDate());
	}
	
	static void BackDateForDefaultValue(ChallengeAuxiliaryDateClass D) {
		
		D.day = 25;
		D.mouth = 12;
		D.year = 2003;
	}
}
