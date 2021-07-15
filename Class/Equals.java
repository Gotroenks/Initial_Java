package Class;

//import java.util.Date;

public class Equals {

	public static void main(String[] args) {
		
		Users U1 = new Users();
		
		U1.Name = "Pedrinho Rittes";
		U1.Email = "Pedrinho.Rittes@hotmail.com";
		
		Users U2 = new Users();
		
		U2.Name = "Pedrinho Rittes";
		U2.Email = "Pedrinho.Rittes@hotmail.com";
				
		System.out.println(U1 == U2);
		System.out.println(U1.equals(U2));
		System.out.println(U2.equals(U1)); 
		
		
	//	System.out.println(U2.equals(new Date())); 
	} 
}
